package co7217.week18.entity.generator

// Import statements for necessary libraries and classes.
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
	
	private static String mPluginFileName = null;

	    // Main method to execute the code.
    def static void main(String[] args) {
        // Initialize the injector for the domain-specific language (DSL)
        Injector injector = new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration();

        // Obtain a resource set from the injector to handle resources.
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

        // Load a resource (model file) from the filesystem.
        Resource resource = resourceSet.getResource(URI.createFileURI("src/main/resources/week18/wordpressPlugin2.dmodel"), true);

        // Extract the root object (Plugin model) from the loaded resource.
        Plugin model = (Plugin) resource.getContents().get(0);

		mPluginFileName = sanitizeFilename(model.getName());

        // Generate the main file for the plugin.
		println "Generating Plugin File."
        generatePluginMainFile(model);

        // Handling activation, deactivation, and uninstall logic for the plugin.
        if ("true".equalsIgnoreCase(model.getActivate())) {
			println "Generating Activate File."
            generateActivationFile(model);
        }

        if ("true".equalsIgnoreCase(model.getDeactivate())) {
			println "Generating Deactivate File."
            generateDeactivationFile(model);
        }

        if ("true".equalsIgnoreCase(model.getUninstall())) {
			println "Generating Uninstall File."
            generateUninstallFile(model);
        }

        // Generate files for widgets, shortcodes, and custom post types.
        for (Widget widget: model.getWidgets()) {
        	println "Generating Widget : " + widget.getWidgetName();
            generateWidgetFile(widget, model);
        }

        for (Shortcode shortcode: model.getShortcodes()) {
			println "Generating Shortcode : " + shortcode.getShortcodeName();
            generateShortcodeFile(shortcode, model);
        }

        for (CustomPostType cpt: model.getCustomPostTypes()) {
			println "Generating CustomPostType : " + cpt.getPostTypeName();
            generateCustomPostTypeFile(cpt, model);
        }

        // Add hooks as specified in the plugin file.
        for (Hook hook: model.getHooks()) {
        	println "Generating Hook : " + hook.getHookName();
            generateHooks(hook, model);
        }
    }

    /**
     * Generates the main PHP file for the WordPress plugin.
     * The file includes basic plugin information like name, description, version, and author.
     *
     * @param model The Plugin object containing details needed for generating the main file.
     */
    def static void generatePluginMainFile(Plugin model) {
        // Extracting basic plugin details from the Plugin object.
        String pluginName = model.getName();
        String pluginDescription = model.getDescription();
        String pluginVersion = model.getVersion();
        String pluginAuthor = model.getAuthor();

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
        String fileName = sanitizeFilename(model.getName()) + ".php";
        writeFile(content, fileName);
    }

    /**
     * Generates the activation file for the WordPress plugin.
     * This file includes a PHP function for the plugin's activation logic and registers it with WordPress.
     *
     * @param model The Plugin object from which activation details are retrieved.
     */
    def static void generateActivationFile(Plugin model) {
        // Start building the PHP file content for plugin activation.
        String content = """<?php\n\n"""

        // Adding a function for plugin activation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${getPluginPrefix(model)}_activate() {\n"""
        content += """    // Activation code here\n"""
        content += """}\n\n"""

        // Registering the activation function with WordPress.
        // It hooks the function to the plugin activation event.
        content += """register_activation_hook(__FILE__, '${getPluginPrefix(model)}_activate');\n"""

        // Writing the built content to the activation PHP file.
        String fileName = sanitizeFilename("activate") + ".php";
        writeFile(content, fileName);

        // Including the newly created activation file in the main plugin file.
        include(fileName, model)
    }

    /**
     * Generates the deactivation file for the WordPress plugin.
     * This file includes a PHP function for the plugin's deactivation logic and registers it with WordPress.
     *
     * @param model The Plugin object from which deactivation details are retrieved.
     */
    def static void generateDeactivationFile(Plugin model) {
        // Starting the PHP file content for plugin deactivation.
        String content = """<?php\n\n"""
        
        // Adding a function for plugin deactivation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${getPluginPrefix(model)}_deactivate() {\n"""
        content += """    // Deactivation code here\n"""
        content += """}\n\n"""

        // Registering the deactivation function with WordPress.
        // It hooks the function to the plugin deactivation event.
        content += """register_deactivation_hook(__FILE__, '${getPluginPrefix(model)}_deactivate');\n"""

        // Writing the built content to the deactivation PHP file.
        String fileName = sanitizeFilename("deactivate") + ".php";
        writeFile(content, fileName);

        // Including the newly created deactivation file in the main plugin file.
        include(fileName, model)
    }

	/**
	 * Generates the uninstallation file for the WordPress plugin.
	 * This file includes a PHP function for the plugin's uninstall logic and registers it with WordPress.
	 *
	 * @param model The Plugin object from which uninstallation details are retrieved.
	 */
	def static void generateUninstallFile(Plugin model) {
		// Starting the PHP file content for plugin uninstallation.
		String content = """<?php\n\n"""
        
        // Adding a function for plugin uninstallation.
        // The function name is dynamically generated using the plugin prefix from the model.
        content += """function ${getPluginPrefix(model)}_uninstall() {\n"""
		content += """    // Uninstallation code here\n"""
        content += """}\n\n"""

		// Registering the uninstallation function with WordPress.
		// It hooks the function to the plugin uninstallation event.
		content += """register_uninstall_hook(__FILE__, '${getPluginPrefix(model)}_uninstall');\n"""

        // Writing the built content to the uninstallation PHP file.
        String fileName = sanitizeFilename("uninstall") + ".php";
        writeFile(content, fileName);

        // Including the newly created uninstallation file in the main plugin file.
        include(fileName, model)
    }

    /**
     * Generates a PHP file for a specific widget in the WordPress plugin.
     * The file contains code for defining the widget and its behavior.
     *
     * @param widget The Widget object containing details about the widget.
     * @param model The Plugin object associated with this widget.
     */
    def static void generateWidgetFile(Widget widget, Plugin model) {
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
        content += """class ${getPluginPrefix(model)}_${widgetName}_widget extends WP_Widget {\n"""
        content += """    public function __construct() {\n"""
        content += """        // actual widget processes\n\n"""
        content += """        parent::__construct(\n"""
        content += """            '${widgetName}', // Base ID\n"""
        content += """            '${widget.getWidgetName()}', // Name\n"""
        content += """            array( 'description' => __( '${widget.getWidgetDescription()}', '${getPluginPrefix(model)}' ) ) // Args\n"""
        content += """        );\n\n"""
        content += """        add_action( 'widgets_init',  function() {\n"""
        content += """            register_widget( '${getPluginPrefix(model)}_${widgetName}_widget' );\n"""
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
        content += """\$${getPluginPrefix(model)}_${widgetName} = new ${getPluginPrefix(model)}_${widgetName}();\n""";

        // Writing the built content to the widget-[widget-name] PHP file.
        String fileName = sanitizeFilename("widget-${widget.getWidgetName()}") + ".php";
        writeFile(content, fileName);

        // Including the newly created widget file in the main plugin file.
        include(fileName, model)
    }

    /**
     * Generates a PHP file for a specific shortcode in the WordPress plugin.
     * This file contains the shortcode implementation and registration.
     *
     * @param shortcode The Shortcode object containing details about the shortcode.
     * @param model The Plugin object associated with this shortcode.
     */
    def static void generateShortcodeFile(Shortcode shortcode, Plugin model) {
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
        content += """// [${getPluginPrefix(model)}_${shortcodeName}${defaultSettings}]\n"""
        content += """function ${getPluginPrefix(model)}_${shortcodeName}_shortcode ( \$atts = [], \$content = null) {\n\n"""
        content += """    // extract attributes\n"""
        content += """    \$a = shortcode_atts( array("""
        content += """${extractSettings}\n"""
        content += """    ), \$atts );\n\n"""
        content += """    // always return something\n"""
        content += """    return '';\n"""
        content += """}\n\n"""
        content += """add_shortcode('${getPluginPrefix(model)}_${shortcodeName}', '${getPluginPrefix(model)}_${shortcodeName}_shortcode');\n"""

        // Writing the built content to the shortcode-[shortcode-name] PHP file.
        String fileName = sanitizeFilename("shortcode-${shortcode.getShortcodeName()}") + ".php";
        writeFile(content, fileName);

        // Including the newly created shortcode file in the main plugin file.
        include(fileName, model)
    }

    /**
     * Generates a PHP file for defining a custom post type (CPT) in the WordPress plugin.
     *
     * @param cpt The CustomPostType object containing details about the custom post type.
     * @param model The Plugin object associated with this custom post type.
     */
    def static void generateCustomPostTypeFile(CustomPostType cpt, Plugin model) {
        String cptName = sanitizeFieldname(cpt.getPostTypeName());

        String content = """<?php"""
        content += """\n// Custom post type code for $cptName here\n""";

        String filename = sanitizeFilename("custom-post-${cpt.getPostTypeName()}") + ".php";
        writeFile(content, filename);
    }

    /**
     * Generates and appends the necessary code for a WordPress hook into the plugin's PHP file.
     * This includes registering the hook with a specified type, name, and callback function.
     *
     * @param hook The Hook object containing details about the hook.
     * @param model The Plugin object associated with this hook.
     */
    def static void generateHooks(Hook hook, Plugin model) {
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
        content += """function ${getPluginPrefix(model)}_${callback} ( ${variables} ) {\n"""
        content += """    // Logic for ${callback} goes here\n"""
        content += """}\n"""
        
        // Registering the hook with WordPress, using the hook type, name, and callback function.
        content += """add_${hookType}('${hookName}', '${getPluginPrefix(model)}_${callback}'${priority}${acceptedArgs});\n"""

        // Writing the built content to the [plugin-name] PHP file.
        String pluginName = sanitizeFilename(model.getName()) + ".php";
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
     * Retrieves the prefix of the plugin.
     *
     * @param model The Plugin object from which to retrieve the prefix.
     * @return The prefix of the plugin.
     */
    def static String getPluginPrefix(Plugin model) {
        // Returns the prefix attribute from the Plugin model.
        return model.getPrefix();
    }

    /**
     * Includes a given file in the main plugin file.
     * 
     * @param fileName The name of the file to be included.
     * @param model The Plugin object containing the plugin's details.
     */
    def static void include(String fileName, Plugin model) {
        // Preparing the content to be written to the plugin's main file. 
        // It adds a 'require_once' statement for the given fileName.
        String content = """require_once plugin_dir_path(__FILE__) . ('${fileName}');\n"""

        // Writing the 'require_once' statement to the plugin's main PHP file.
        // The 'true' parameter in writeFile indicates that the content should be appended to the file.
		String pluginName = sanitizeFilename(model.getName()) + ".php";
        writeFile(content, pluginName, true);
    }
	
	def static String sanitizeFilename(String filename) {
		return filename.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "-").replaceAll("-\$", "");
	}
	
	def static String sanitizeFieldname(String fieldname) {
		return fieldname.toLowerCase().replace(" ", "_").replaceAll("[^a-zA-Z0-9]+", "_").replaceAll("_\$", "");
	}
}