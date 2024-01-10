package co7217.week18.entity.generator

// Import statements for necessary libraries and classes.
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import co7217.week18.entity.EntityDslStandaloneSetup
import co7217.week18.entity.entityDsl.CustomPostType
import co7217.week18.entity.entityDsl.Hook
import co7217.week18.entity.entityDsl.Meta
import co7217.week18.entity.entityDsl.PluginModel
import co7217.week18.entity.entityDsl.Setting
import co7217.week18.entity.entityDsl.Shortcode
import co7217.week18.entity.entityDsl.StringList
import co7217.week18.entity.entityDsl.Widget

class EntityGenerator_ExplicitTraversal_JavaClasses {
	
	private static String mPluginFileName = null;
	private static String mPluginPrefix = null;
	private static String mPluginTextDomain = null;
	
	    // Main method to execute the code.
    def static void main(String[] args) {
        // Initialize the injector for the domain-specific language (DSL)
        Injector injector = new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration();

        // Obtain a resource set from the injector to handle resources.
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

        // Load a resource (model file) from the filesystem.
        Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/week18/wordpressPlugin3.dmodel"), true);

        // Extract the root object (Plugin model) from the loaded resource.
        PluginModel model = (PluginModel) resource.getContents().get(0);		
		generate(model);
    }

	def static void generate(PluginModel model) {
		for (el in model.elements) {
			switch(el) {
				case Meta :
					mPluginFileName = sanitizeFilename(el.getName())
					mPluginPrefix = el.getPrefix()
					mPluginTextDomain = el.getTextDomain()
					generatePluginMainFile(el)
					break
				case Widget :
					generateWidgetFile(el)
					break
				case Shortcode :
					generateShortcodeFile(el)
					break
				case CustomPostType :
					generateCustomPostTypeFile(el)
					break
				case Hook :
					generateHooks(el)
					break
			}
		}
	}

    /**
     * Generates the main PHP file for the WordPress plugin.
     * The file includes basic plugin information like name, description, version, and author.
     *
     * @param model The Plugin object containing details needed for generating the main file.
     */
    def static void generatePluginMainFile(Meta meta) {
		println "Generating Main Plugin File."
		
        // Extracting basic plugin details from the Plugin object.
        String pluginName = meta.getName();
        String pluginDescription = meta.getDescription();
        String pluginVersion = meta.getVersion();
        String pluginAuthor = meta.getAuthor();

        // Constructing the PHP file content with plugin metadata.
        // This includes plugin name, description, version, and author.
		String content = """<?php\n"""
        content += """/*\n"""
        content += """        Plugin Name: $pluginName\n"""
        content += """        Description: $pluginDescription\n"""
        content += """        Version: $pluginVersion\n"""
        content += """        Author: $pluginAuthor\n"""
        content += """*/\n\n"""
        content += """// Plugin code here\n"""

        // Converting the plugin name to lowercase and replacing spaces with hyphens.
        // This is typically done for file naming conventions.
        String fileName = sanitizeFilename(mPluginFileName) + ".php";
        writeFile(content, fileName);
		
		// Handling activation, deactivation, and uninstall logic for the plugin.
		if ("true".equalsIgnoreCase(meta.getActivate())) {
			generateActivationFile(meta);
		}

		if ("true".equalsIgnoreCase(meta.getDeactivate())) {
			generateDeactivationFile(meta);
		}

		if ("true".equalsIgnoreCase(meta.getUninstall())) {
			generateUninstallFile(meta);
		}
    }

    /**
     * Generates the activation file for the WordPress plugin.
     * This file includes a PHP function for the plugin's activation logic and registers it with WordPress.
     *
     * @param model The Plugin object from which activation details are retrieved.
     */
    def static void generateActivationFile(Meta meta) {
		println "Generating Activate File."

        // Start building the PHP file content for plugin activation.
        String content = """<?php\n\n"""

        // Adding a function for plugin activation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${mPluginPrefix}_activate() {\n"""
        content += """    // Activation code here\n"""
        content += """}\n\n"""

        // Registering the activation function with WordPress.
        // It hooks the function to the plugin activation event.
        content += """register_activation_hook(__FILE__, '${mPluginPrefix}_activate');\n"""

        // Writing the built content to the activation PHP file.
        String fileName = sanitizeFilename("activate") + ".php";
        writeFile(content, fileName);

        // Including the newly created activation file in the main plugin file.
        include(fileName)
    }

    /**
     * Generates the deactivation file for the WordPress plugin.
     * This file includes a PHP function for the plugin's deactivation logic and registers it with WordPress.
     *
     * @param model The Plugin object from which deactivation details are retrieved.
     */
    def static void generateDeactivationFile(Meta meta) {
		println "Generating Deactivate File."

        // Starting the PHP file content for plugin deactivation.
        String content = """<?php\n\n"""
        
        // Adding a function for plugin deactivation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${mPluginPrefix}_deactivate() {\n"""
        content += """    // Deactivation code here\n"""
        content += """}\n\n"""

        // Registering the deactivation function with WordPress.
        // It hooks the function to the plugin deactivation event.
        content += """register_deactivation_hook(__FILE__, '${mPluginPrefix}_deactivate');\n"""

        // Writing the built content to the deactivation PHP file.
        String fileName = sanitizeFilename("deactivate") + ".php";
        writeFile(content, fileName);

        // Including the newly created deactivation file in the main plugin file.
        include(fileName)
    }

	/**
	 * Generates the uninstallation file for the WordPress plugin.
	 * This file includes a PHP function for the plugin's uninstall logic and registers it with WordPress.
	 *
	 * @param model The Plugin object from which uninstallation details are retrieved.
	 */
	def static void generateUninstallFile(Meta meta) {
		println "Generating Uninstall File."

		// Starting the PHP file content for plugin uninstallation.
		String content = """<?php\n\n"""
        
        // Adding a function for plugin uninstallation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${mPluginPrefix}_uninstall() {\n"""
		content += """    // Uninstallation code here\n"""
        content += """}\n\n"""

		// Registering the uninstallation function with WordPress.
		// It hooks the function to the plugin uninstallation event.
		content += """register_uninstall_hook(__FILE__, '${mPluginPrefix}_uninstall');\n"""

        // Writing the built content to the uninstallation PHP file.
        String fileName = sanitizeFilename("uninstall") + ".php";
        writeFile(content, fileName);

        // Including the newly created uninstallation file in the main plugin file.
        include(fileName)
    }

    /**
     * Generates a PHP file for a specific widget in the WordPress plugin.
     * The file contains code for defining the widget and its behavior.
     *
     * @param widget The Widget object containing details about the widget.
     * @param model The Plugin object associated with this widget.
     */
    def static void generateWidgetFile(Widget widget) {
		println "Generating Widget : " + widget.getWidgetName();

        // Preparing the widget name by converting it to lowercase and replacing spaces with underscores.
        String widgetName = sanitizeFieldname(widget.getWidgetName());
        String widgetDescription = widget.getWidgetDescription();
        
        // Iterating over each setting of the widget and appending the setting update logic.
        String updateSettings = ''
        widget.getSettings().forEach({
            Setting it ->
            updateSettings += """\n        \$instance['${it.getSettingName()}'] = ( ! empty( \$new_instance['${it.getSettingName()}'] ) ) ? strip_tags( \$new_instance['${it.getSettingName()}'] ) : '${it.getDefaultValue()}';"""
        });

        // Building the content of the PHP file for the widget.
        String content = """<?php\n"""
        content += """// Widget code for $widgetName here\n\n"""
        content += """class ${mPluginPrefix}_${widgetName}_widget extends WP_Widget {\n"""
        content += """    public function __construct() {\n"""
        content += """        // actual widget processes\n\n"""
        content += """        parent::__construct(\n"""
        content += """            '${widgetName}', // Base ID\n"""
        content += """            '${widget.getWidgetName()}', // Name\n"""
        content += """            array( 'description' => __( '${widget.getWidgetDescription()}', '${mPluginTextDomain}' ) ) // Args\n"""
        content += """        );\n\n"""
        content += """        add_action( 'widgets_init',  function() {\n"""
        content += """            register_widget( '${mPluginPrefix}_${widgetName}_widget' );\n"""
        content += """        });\n"""
        content += """    }\n\n"""
        content += """    public \$args = array(\n"""
        content += """        'before_title'  => '',\n"""
        content += """        'after_title'   => '',\n"""
        content += """        'before_widget' => '',\n"""
        content += """        'after_widget'  => '',\n"""
        content += """    );\n\n"""
        content += """    public function widget( \$args, \$instance ) {\n"""
        content += """        // outputs the content of the widget\n"""
        content += """    }\n\n"""
        content += """    public function form ( \$instance ) {\n"""
        content += """        // outputs the options form in the admin\n"""
        content += """    }\n\n"""
        content += """    public function update ( \$new_instance, \$old_instance ) {\n"""
        content += """        \$instance          = array();\n"""
        content += """        ${updateSettings}\n\n"""
        content += """        return \$instance;\n"""
        content += """    }\n"""
        content += """}\n\n"""
        content += """\$${mPluginPrefix}_${widgetName} = new ${mPluginPrefix}_${widgetName}();\n""";

        // Writing the built content to the widget-[widget-name] PHP file.
        String fileName = sanitizeFilename("widget-${widget.getWidgetName()}") + ".php";
        writeFile(content, fileName);

        // Including the newly created widget file in the main plugin file.
        include(fileName)
    }

    /**
     * Generates a PHP file for a specific shortcode in the WordPress plugin.
     * This file contains the shortcode implementation and registration.
     *
     * @param shortcode The Shortcode object containing details about the shortcode.
     * @param model The Plugin object associated with this shortcode.
     */
    def static void generateShortcodeFile(Shortcode shortcode) {
		println "Generating Shortcode : " + shortcode.getShortcodeName();

        // Preparing the shortcode name by converting it to lowercase and replacing spaces with underscores.
        String shortcodeName = sanitizeFieldname(shortcode.getShortcodeName());
    
        // Iterating over each setting of the shortcode and appending the logic to extract settings.
        String extractSettings = ''
        String defaultSettings = ''
        shortcode.getSettings().forEach({
            Setting it ->
            extractSettings += """\n        '${it.getSettingName()}' => ( ! empty( \$atts['${it.getSettingName()}'] ) ) ? strip_tags( \$atts['${it.getSettingName()}'] ) : '${it.getDefaultValue()}',"""
            defaultSettings += """ ${it.getSettingName()}=\"${it.getDefaultValue()}\""""
        });

        // Building the content of the PHP file for the shortcode.
        String content = """<?php\n"""
        content += """// Shortcode code for $shortcodeName here\n\n"""
        content += """// [${mPluginPrefix}_${shortcodeName}${defaultSettings}]\n"""
        content += """function ${mPluginPrefix}_${shortcodeName}_shortcode ( \$atts = [], \$content = null) {\n\n"""
        content += """    // extract attributes\n"""
        content += """    \$a = shortcode_atts( array("""
        content += """${extractSettings}\n"""
        content += """    ), \$atts );\n\n"""
        content += """    // always return something\n"""
        content += """    return '';\n"""
        content += """}\n\n"""
        content += """add_shortcode('${mPluginPrefix}_${shortcodeName}', '${mPluginPrefix}_${shortcodeName}_shortcode');\n"""

        // Writing the built content to the shortcode-[shortcode-name] PHP file.
        String fileName = sanitizeFilename("shortcode-${shortcode.getShortcodeName()}") + ".php";
        writeFile(content, fileName);

        // Including the newly created shortcode file in the main plugin file.
        include(fileName)
    }

    /**
     * Generates a PHP file for defining a custom post type (CPT) in the WordPress plugin.
     *
     * @param cpt The CustomPostType object containing details about the custom post type.
     * @param model The Plugin object associated with this custom post type.
     */
    def static void generateCustomPostTypeFile(CustomPostType cpt) {
		println "Generating CustomPostType : " + cpt.getCptSingularName();

        String cptName = sanitizeFieldname(cpt.getCptSingularName());

        String content = """\n// Register Custom Post Type for '${cpt.getCptSingularName()}'\n"""
		content += """function register_${mPluginPrefix}_${cptName}_post_type() {\n"""
		content += """    // Set up labels for the '${cpt.getCptSingularName()}' post type\n"""
		content += """\n"""
		content += """    \$labels = array(\n"""
		content += """        'name'          => __( '${cpt.getCptName()}', '${mPluginTextDomain}'),\n"""
		content += """        'singular_name' => __( '${cpt.getCptSingularName()}', '${mPluginTextDomain}'),\n"""
		content += """    );\n\n"""
		content += """    // Set up the arguments for the '${cpt.getCptSingularName()}' post type\n"""
		content += """    \$args = array(\n"""
		content += """        'label'           => __( '${cpt.getCptName()}', '${mPluginTextDomain}'),\n"""
		content += """        'description'     => __( '${cpt.getCptName()}', '${mPluginTextDomain}'),\n"""
		content += """        'labels'          => \$labels,\n"""
		content += """        'supports'        => array(${toStringList(cpt.getCptSupports())}),\n"""
		content += """        'supports'        => array(${toStringList(cpt.getCptTaxonomies())}),\n"""
		content += """        'show_ui'         => true,\n"""
		content += """        'show_in_menu'    => true,\n"""
		content += """        'capability_type' => 'post'\n"""
		content += """    );\n\n"""
		content += """    // Register the '${cpt.getCptSingularName()}' post type\n"""
		content += """    register_post_type('${cptName}', \$args);\n\n"""
		content += """}\n\n"""
		content += """// Hook into the 'init' action\n"""
		content += """add_action('init', 'register_${mPluginPrefix}_${cptName}_post_type', 0);\n\n"""
		
        // Writing the built content to the [plugin-name] PHP file.
        String pluginName = sanitizeFilename(mPluginFileName) + ".php";
        writeFile(content, pluginName, true);
    }

    /**
     * Generates and appends the necessary code for a WordPress hook into the plugin's PHP file.
     * This includes registering the hook with a specified type, name, and callback function.
     *
     * @param hook The Hook object containing details about the hook.
     * @param model The Plugin object associated with this hook.
     */
    def static void generateHooks(Hook hook) {
		println "Generating Hook : " + hook.getHookName();

        // Extracting necessary information from the hook object.
        String hookType = hook.getHookType(); // The type of the hook (e.g., action or filter).
        String hookName = hook.getHookName();
        String callback = sanitizeFieldname(hook.getCallback());

        // Handling the priority of the hook. If it's not specified, it defaults to an empty string.
        String priority = hook.getPriority() ? """, ${hook.getPriority()}""" : "";
        
        // Handling the number of accepted arguments for the hook.
        String acceptedArgs = hook.getAcceptedArgs() ? """, ${hook.getAcceptedArgs()}""" : "";

        // If accepted arguments are specified but priority is not, default priority to 10.
        if (hook.getAcceptedArgs() && !hook.getPriority()) {
            priority = """, 10""";
        }

        // Building a string of variables for the callback function's parameters.
        String variables = """\$val0""";
        for (int i = 1; i < hook.getAcceptedArgs(); i++) {
            variables += """, \$val${i}"""
        }

        // Constructing the content for the PHP file.
        String content = """\n"""
        content += """function ${mPluginPrefix}_${callback} ( ${variables} ) {\n"""
        content += """    // Logic for ${callback} goes here\n"""
        content += """}\n"""
        
        // Registering the hook with WordPress, using the hook type, name, and callback function.
        content += """add_${hookType}('${hookName}', '${mPluginPrefix}_${callback}'${priority}${acceptedArgs});\n"""

        // Writing the built content to the [plugin-name] PHP file.
        String pluginName = sanitizeFilename(mPluginFileName) + ".php";
        writeFile(content, pluginName, true);
    }

	/**
	 * Writes content to a specified file. If the file doesn't exist, it's created.
	 * If the folder path doesn't exist, it's also created.
	 * 
	 * @param content The content to be written to the file.
	 * @param fileName The name of the file to write to.
	 * @param append A boolean flag indicating whether to append to the file 
	 *               (true) or overwrite it (false).
	 * @throws IOException If there is an issue in creating the folder or writing to the file.
	 * @throws IllegalArgumentException If the plugin name is invalid.
	 */
	def static void writeFile(String content, String fileName, boolean append = false) {
	    try {
	        // Check if the plugin name is valid
	        if (!mPluginFileName) {
	            throw new IllegalArgumentException("Invalid plugin name");
	        }
	
	        // Define the folder path based on the plugin name
	        String folderPath = "src/main/resources/week18/generated/${mPluginFileName}/"
	        
	        // Create a File object representing the folder
	        File folder = new File(folderPath)
	
	        // Check if the folder exists, and create it if it doesn't
	        if (!folder.exists()) {
	            if(!folder.mkdirs()) {
	                throw new IOException("Failed to create the folder: ${folderPath}")
	            }
	        }
	            
	        // Create a File object for the specific file to be written
	        File file = new File(folderPath + fileName);
	
	        // Create a FileWriter object for writing to the file
	        // Set it to append mode if 'append' is true
	        FileWriter writer = new FileWriter(file, append);
	
	        // Write the provided content to the file
	        writer.write(content);
	
	        // Close the FileWriter to release system resources
	        writer.close();
	    } catch (IOException e) {
	        // Print the stack trace if an IOException occurs
	        e.printStackTrace();
	    }
	}

    /**
     * Includes a given file in the main plugin file.
     * 
     * @param fileName The name of the file to be included.
     * @param model The Plugin object containing the plugin's details.
     */
    def static void include(String fileName) {
        // Preparing the content to be written to the plugin's main file. 
        // It adds a 'require_once' statement for the given fileName.
        String content = """require_once plugin_dir_path(__FILE__) . ('${fileName}');\n"""

        // Writing the 'require_once' statement to the plugin's main PHP file.
        // The 'true' parameter in writeFile indicates that the content should be appended to the file.
		String pluginName = sanitizeFilename(mPluginFileName) + ".php";
        writeFile(content, pluginName, true);
    }
	
	def static String sanitizeFilename(String filename) {
		return filename.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "-").replaceAll("-\$", "");
	}
	
	def static String sanitizeFieldname(String fieldname) {
		return fieldname.toLowerCase().replace(" ", "_").replaceAll("[^a-zA-Z0-9]+", "_").replaceAll("_\$", "");
	}
	
/**
 * Converts an EList of StringList objects to a single, comma-separated string.
 * Each element in the resulting string is enclosed in single quotes.
 *
 * @param eList The EList containing StringList objects.
 * @return A string representation of all values contained in the StringList objects,
 *         formatted as a comma-separated list, with each item enclosed in single quotes.
 */
def static toStringList(EList<StringList> eList) {
    // Initialize an empty list to hold all the strings.
    def allStrings = []

    // For each StringList, add all its values to the allStrings list.
    eList.each { allStrings.addAll(it.values) }

    // For example, if allStrings contains ['a', 'b', 'c'], the output will be "'a', 'b', 'c'".
    return "'" + allStrings.join("', '") + "'"
}
}