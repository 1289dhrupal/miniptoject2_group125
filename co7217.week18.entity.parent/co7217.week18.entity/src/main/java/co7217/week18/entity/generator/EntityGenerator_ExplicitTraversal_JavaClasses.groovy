package co7217.week18.entity.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import co7217.week18.entity.EntityDslStandaloneSetup
import co7217.week18.entity.entityDsl.CustomPostType
import co7217.week18.entity.entityDsl.Plugin
import co7217.week18.entity.entityDsl.Setting
import co7217.week18.entity.entityDsl.Shortcode
import co7217.week18.entity.entityDsl.Widget


class EntityGenerator_ExplicitTraversal_JavaClasses {

	def static void main(String[] args) {
		// Initialize the injector for the DSL
		Injector injector = new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		// Obtain a resource set from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

     // Load a resource by URI, in this case from the file system
        Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/week18/wordpressPlugin.dmodel"), true);

        // Get the root object of the model
        Plugin model = (Plugin) resource.getContents().get(0);

        // Generate plugin main file
        generatePluginMainFile(model);

		
        // Generate additional files for widgets, shortcodes, and custom post types
        for (Widget widget : model.getWidgets()) {
            generateWidgetFile(widget, model);
        }

        for (Shortcode shortcode : model.getShortcodes()) {
            generateShortcodeFile(shortcode, model);
        }

        for (CustomPostType cpt : model.getCustomPostTypes()) {
            generateCustomPostTypeFile(cpt, model);
        }

        // Generate activation and deactivation files
		if(model.getActivate().toLowerCase().equals("true")) {
			generateActivationFile(model);			
		}

		if(model.getDeactivate().toLowerCase().equals("true")) {
			generateDeactivationFile(model);
		}
    }

    def static void generatePluginMainFile(Plugin model) {
        def pluginName = model.getName();
		def pluginDescription = model.getDescription();
		def pluginVersion = model.getVersion();
		def pluginAuthor = model.getAuthor();
		
        def content = """<?php
/*
		Plugin Name: $pluginName
		Description: $pluginDescription
		Version: $pluginVersion
		Author: $pluginAuthor
*/

// Plugin code here
""";

        pluginName = pluginName.toLowerCase().replace(" ", "-");
        writeFile(content, pluginName + ".php");
    }

    def static void generateActivationFile(Plugin model) {
        String content = """<?php
function ${getPluginPrefix(model)}_activate() {
	// Activation code here
}

register_activation_hook(__FILE__, '${getPluginPrefix(model)}_activate');
""";
        writeFile(content, "activate.php");
    }

    def static void generateDeactivationFile(Plugin model) {
        String content = """<?php
function ${getPluginPrefix(model)}_deactivate() {
	// Deactivation code here
}

register_deactivation_hook(__FILE__, '${getPluginPrefix(model)}_deactivate');
""";
        writeFile(content, "deactivate.php");
    }

    def static void generateWidgetFile(Widget widget, Plugin model) {
        String widgetName = widget.getWidgetName().toLowerCase().replace(" ", "_");
		String widgetDescription = widget.getWidgetDescription();
		String updateSettings = ''
		widget.getSettings().forEach({Setting it ->
			updateSettings += """
		\$instance['${it.getSettingName()}'] = ( ! empty( \$new_instance['${it.getSettingName()}'] ) ) ? strip_tags( \$new_instance['${it.getSettingName()}'] ) : '${it.getDefaultValue()}';"""			
		});

        String content = """<?php
// Widget code for $widgetName here

class ${getPluginPrefix(model)}_${widgetName} extends WP_Widget {
	public function __construct() {
		// actual widget processes

		parent::__construct(
			'${widgetName}', // Base ID
			'${widget.getWidgetName()}', // Name
			array( 'description' => __( '${widget.getWidgetDescription()}', '${getPluginPrefix(model)}' ) ) // Args
		);

		add_action( 'widgets_init',  function() {
			register_widget( '${getPluginPrefix(model)}_${widgetName}' );
		});
	}

	public \$args = array(
		'before_title'  => '',
		'after_title'   => '',
		'before_widget' => '',
		'after_widget'  => '',
	);

	public function widget( \$args, \$instance ) {
		// outputs the content of the widget
	}

	public function form ( \$instance ) {
		// outputs the options form in the admin
	}

	public function update ( \$new_instance, \$old_instance ) {
		\$instance          = array();
		${updateSettings}

		return \$instance;
	}
}

\$${getPluginPrefix(model)}_${widgetName} = new ${getPluginPrefix(model)}_${widgetName}();

""";
        writeFile(content, "widget-" + widgetName + ".php");
    }

    def static void generateShortcodeFile(Shortcode shortcode, Plugin model) {
        String shortcodeName = shortcode.getShortcodeName();
        String content = """<?php
// Shortcode code for $shortcodeName here
""";
        shortcodeName = shortcodeName.toLowerCase().replace(" ", "-");
        writeFile(content, "shortcode-" + shortcodeName + ".php");
    }

    def static void generateCustomPostTypeFile(CustomPostType cpt, Plugin model) {
        String cptName = cpt.getPostTypeName().toLowerCase().replace(" ", "-");
        String content = """<?php
// Custom post type code for $cptName here
""";
        cptName = cpt.toLowerCase().replace(" ", "-");
        writeFile(content, "custom-post-" + cptName + ".php");
    }

    def static void writeFile(String content, String fileName) {
        try {
            File file = new File("src/main/resources/week18/generated/" + fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	def static String getPluginPrefix(Plugin model) {
		return model.getPrefix();
	}
}