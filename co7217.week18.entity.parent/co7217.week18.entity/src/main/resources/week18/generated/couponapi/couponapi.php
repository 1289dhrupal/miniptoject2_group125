<?php
/*
        Plugin Name: CouponAPI
        Description: This is an example plugin.
        Version: 1.0.0
        Author: Dhrupal Shah
*/

// Plugin code here
require_once plugin_dir_path(__FILE__) . ('activate.php');
require_once plugin_dir_path(__FILE__) . ('deactivate.php');
require_once plugin_dir_path(__FILE__) . ('uninstall.php');
require_once plugin_dir_path(__FILE__) . ('widget-example-1.php');
require_once plugin_dir_path(__FILE__) . ('shortcode-example-2.php');

function capi_save_post ( $val0, $val1 ) {
    // Logic for save_post goes here
}
add_filter('save_post', 'capi_save_post', 10, 2);
