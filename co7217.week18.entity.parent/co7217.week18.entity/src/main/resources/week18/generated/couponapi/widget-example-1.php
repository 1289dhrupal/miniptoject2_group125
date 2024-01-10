<?php
// Widget code for example_1 here

class capi_example_1_widget extends WP_Widget {
    public function __construct() {
        // actual widget processes

        parent::__construct(
            'example_1', // Base ID
            'Example 1', // Name
            array( 'description' => __( 'This is a sample widget', 'capi-domain' ) ) // Args
        );

        add_action( 'widgets_init',  function() {
            register_widget( 'capi_example_1_widget' );
        });
    }

    public $args = array(
        'before_title'  => '',
        'after_title'   => '',
        'before_widget' => '',
        'after_widget'  => '',
    );

    public function widget( $args, $instance ) {
        // outputs the content of the widget
    }

    public function form ( $instance ) {
        // outputs the options form in the admin
    }

    public function update ( $new_instance, $old_instance ) {
        $instance          = array();
        
        $instance['BackgroundColor'] = ( ! empty( $new_instance['BackgroundColor'] ) ) ? strip_tags( $new_instance['BackgroundColor'] ) : '#FFFFFF';
        $instance['Width'] = ( ! empty( $new_instance['Width'] ) ) ? strip_tags( $new_instance['Width'] ) : '800';

        return $instance;
    }
}

$capi_example_1 = new capi_example_1();
