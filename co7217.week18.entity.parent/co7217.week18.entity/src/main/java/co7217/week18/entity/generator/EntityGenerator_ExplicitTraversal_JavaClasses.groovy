package co7217.week18.entity.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import co7217.week18.entity.EntityDslStandaloneSetup
import co7217.week18.entity.entityDsl.CustomPostType
import co7217.week18.entity.entityDsl.Hook
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

		String pluginName = model.getName().toLowerCase().replace(" ", "-");
		
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
		
		// Add Hooks to the plugin file
		for (Hook hook : model.getHooks()) {
			generateHooks(hook, model);
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
		String fileName = "activate.php";
		writeFile(content, fileName);
		include(fileName, model)
	}

	def static void generateDeactivationFile(Plugin model) {
		String content = """<?php
function ${getPluginPrefix(model)}_deactivate() {
	// Deactivation code here
}

register_deactivation_hook(__FILE__, '${getPluginPrefix(model)}_deactivate');
""";
		String fileName = "deactivate.php";
		writeFile(content, fileName);
		include(fileName, model)

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

class ${getPluginPrefix(model)}_${widgetName}_widget extends WP_Widget {
	public function __construct() {
		// actual widget processes

		parent::__construct(
			'${widgetName}', // Base ID
			'${widget.getWidgetName()}', // Name
			array( 'description' => __( '${widget.getWidgetDescription()}', '${getPluginPrefix(model)}' ) ) // Args
		);

		add_action( 'widgets_init',  function() {
			register_widget( '${getPluginPrefix(model)}_${widgetName}_widget' );
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
		widgetName = widgetName.replace("_", "-");		
		String fileName = "widget-" + widgetName + ".php";
		writeFile(content, fileName);
		include(fileName, model)
	}

	def static void generateShortcodeFile(Shortcode shortcode, Plugin model) {
		String shortcodeName = shortcode.getShortcodeName().toLowerCase().replace(" ", "_");
		String extractSettings = ''
		String defaultSettings = ''
		shortcode.getSettings().forEach({Setting it ->
			extractSettings += """
		'${it.getSettingName()}' => ( ! empty( \$atts['${it.getSettingName()}'] ) ) ? strip_tags( \$atts['${it.getSettingName()}'] ) : '${it.getDefaultValue()}',"""
			defaultSettings += " ${it.getSettingName()}=\"${it.getDefaultValue()}\""
		});

		String content = """<?php
// Shortcode code for $shortcodeName here

// [${getPluginPrefix(model)}_${shortcodeName}${defaultSettings}]
function ${getPluginPrefix(model)}_${shortcodeName}_shortcode ( \$atts = [], \$content = null) {

	// extract attributes
	\$a = shortcode_atts( array(${extractSettings}
	), \$atts );

    // always return
    return '';
}

add_shortcode('${getPluginPrefix(model)}_${shortcodeName}', '${getPluginPrefix(model)}_${shortcodeName}_shortcode');
""";
		shortcodeName = shortcodeName.replace("_", "-");		
		String fileName = "shortcode-" + shortcodeName + ".php";
		writeFile(content, fileName);
		include(fileName, model)

	}

	def static void generateCustomPostTypeFile(CustomPostType cpt, Plugin model) {
		String cptName = cpt.getPostTypeName().toLowerCase().replace(" ", "-");
		String content = """<?php
// Custom post type code for $cptName here
""";
		cptName = cpt.toLowerCase().replace(" ", "-");
		writeFile(content, "custom-post-" + cptName + ".php");
	}

	def static void generateHooks(Hook hook, Plugin model) {
		String hookType = hook.getHookType();
		String hookName = hook.getHookName();
		String callback = hook.getCallback().toLowerCase().replace(" ", "_");
		String priority = hook.getPriority() ? """, ${hook.getPriority()}""" : "";
		String acceptedArgs = hook.getAcceptedArgs() ? """, ${hook.getAcceptedArgs()}""" : "";

		if (hook.getAcceptedArgs() && !hook.getPriority()) {
			priority = """, 10""";
		}

		String variables = """\$val0""";
		for (int i=1; i<hook.getAcceptedArgs(); i++) {
			variables += """, \$val${i}"""
		}
		String content = """
function ${getPluginPrefix(model)}_${callback} ( ${variables} ) {
	// Logic for ${callback} goes here
}
${hookType}('${hookName}', '${getPluginPrefix(model)}_${callback}'${priority}${acceptedArgs});
"""
		String pluginName = model.getName().toLowerCase().replace(" ", "-");
		writeFile(content, pluginName + ".php", true);
	}

	def static void writeFile(String content, String fileName, boolean append = false) {
		try {
			File file = new File("src/main/resources/week18/generated/" + fileName);
			FileWriter writer = new FileWriter(file, append);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	def static String getPluginPrefix(Plugin model) {
		return model.getPrefix();
	}
	
	def static void include(String fileName, Plugin model) {
		String pluginName = model.getName().toLowerCase().replace(" ", "-");
		String content = """require_once ('${fileName}');
"""
		writeFile(content, pluginName + ".php", true);
	}
}