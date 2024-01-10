<?php
/*
        Plugin Name: MyCustomPlugin
        Description: A custom plugin for content management.
        Version: 1.2.3
        Author: Jane Smith
*/

// Plugin code here
require_once plugin_dir_path(__FILE__) . ('widget-recentposts.php');
require_once plugin_dir_path(__FILE__) . ('shortcode-gallery.php');

function mcp_filtercontent ( $val0, $val1 ) {
    // Logic for filtercontent goes here
}
add_filter('content_filter', 'mcp_filtercontent', 10, 2);

function mcp_postsaveaction ( $val0, $val1, $val2 ) {
    // Logic for postsaveaction goes here
}
add_action('save_post', 'mcp_postsaveaction', 5, 3);
