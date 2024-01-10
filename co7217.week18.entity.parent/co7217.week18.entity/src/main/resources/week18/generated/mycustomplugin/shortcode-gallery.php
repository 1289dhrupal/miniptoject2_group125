<?php
// Shortcode code for gallery here

// [mcp_gallery Images=""]
function mcp_gallery_shortcode ( $atts = [], $content = null) {

    // extract attributes
    $a = shortcode_atts( array(
        'Images' => ( ! empty( $atts['Images'] ) ) ? strip_tags( $atts['Images'] ) : '',
    ), $atts );

    // always return something
    return '';
}

add_shortcode('mcp_gallery', 'mcp_gallery_shortcode');
