<?php
/*
        Plugin Name: MyCustomPlugin
        Description: A custom plugin for content management.
        Version: 1.2.3
        Author: Jane Smith
*/

// Plugin code here
require_once plugin_dir_path(__FILE__) . ('activate.php');
require_once plugin_dir_path(__FILE__) . ('deactivate.php');
require_once plugin_dir_path(__FILE__) . ('uninstall.php');
require_once plugin_dir_path(__FILE__) . ('widget-recentposts.php');
require_once plugin_dir_path(__FILE__) . ('shortcode-gallery.php');

// Register Custom Post Type for 'Book'
function register_mcp_book_post_type() {
    // Set up labels for the 'Book' post type

    $labels = array(
        'name'          => __( 'Books', 'my-custom-plugin'),
        'singular_name' => __( 'Book', 'my-custom-plugin'),
    );

    // Set up the arguments for the 'Book' post type
    $args = array(
        'label'           => __( 'Books', 'my-custom-plugin'),
        'description'     => __( 'Books', 'my-custom-plugin'),
        'labels'          => $labels,
        'supports'        => array('title', 'editor', 'thumbnail'),
        'supports'        => array('genre', 'authors'),
        'show_ui'         => true,
        'show_in_menu'    => true,
        'capability_type' => 'post'
    );

    // Register the 'Book' post type
    register_post_type('book', $args);

}

// Hook into the 'init' action
add_action('init', 'register_mcp_book_post_type', 0);


function mcp_filter_content ( $val0, $val1 ) {
    // Logic for filter_content goes here
}
add_filter('content_filter', 'mcp_filter_content', 10, 2);

function mcp_post_save_action ( $val0, $val1, $val2 ) {
    // Logic for post_save_action goes here
}
add_action('save_post', 'mcp_post_save_action', 5, 3);
