<?php
// Shortcode code for example_2 here

// [capi_example_2 Width="800"]
function capi_example_2_shortcode ( $atts = [], $content = null) {

    // extract attributes
    $a = shortcode_atts( array(
        'Width' => ( ! empty( $atts['Width'] ) ) ? strip_tags( $atts['Width'] ) : '800',
    ), $atts );

    // always return something
    return '';
}

add_shortcode('capi_example_2', 'capi_example_2_shortcode');
