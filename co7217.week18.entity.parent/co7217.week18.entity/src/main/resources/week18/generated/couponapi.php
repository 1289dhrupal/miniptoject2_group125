<?php
/*
		Plugin Name: CouponAPI
		Description: This is an example plugin.
		Version: 1.0.0
		Author: Dhrupal Shah
*/

// Plugin code here
require_once ('widget-example-1.php');
require_once ('shortcode-example-2.php');
require_once ('activate.php');
require_once ('deactivate.php');

function capi_fetch_settings ( $val0, $val1 ) {
	// Logic for fetch_settings goes here
}
add_action('init', 'capi_fetch_settings', 15, 2);
