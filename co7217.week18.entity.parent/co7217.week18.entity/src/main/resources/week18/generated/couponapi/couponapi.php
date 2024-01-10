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

// Register Custom Post Type for 'Coupon'
function register_capi_coupon_post_type() {
    // Set up labels for the 'Coupon' post type

    $labels = array(
        'name'          => __( 'Coupons', 'capi-domain'),
        'singular_name' => __( 'Coupon', 'capi-domain'),
    );

    // Set up the arguments for the 'Coupon' post type
    $args = array(
        'label'           => __( 'Coupons', 'capi-domain'),
        'description'     => __( 'Coupons', 'capi-domain'),
        'labels'          => $labels,
        'supports'        => array('title', 'editor', 'thumbnail'),
        'supports'        => array('store', 'location'),
        'show_ui'         => true,
        'show_in_menu'    => true,
        'capability_type' => 'post'
    );

    // Register the 'Coupon' post type
    register_post_type('coupon', $args);

}

// Hook into the 'init' action
add_action('init', 'register_capi_coupon_post_type', 0);


function capi_save_post ( $val0, $val1 ) {
    // Logic for save_post goes here
}
add_action('save_post', 'capi_save_post', 10, 2);
