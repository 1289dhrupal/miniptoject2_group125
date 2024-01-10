<?php
// Widget code for recentposts here

class mcp_recentposts_widget extends WP_Widget {
    public function __construct() {
        // actual widget processes

        parent::__construct(
            'recentposts', // Base ID
            'RecentPosts', // Name
            array( 'description' => __( 'Displays recent posts with thumbnails.', 'mcp' ) ) // Args
        );

        add_action( 'widgets_init',  function() {
            register_widget( 'mcp_recentposts_widget' );
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
        
        $instance['NumberPosts'] = ( ! empty( $new_instance['NumberPosts'] ) ) ? strip_tags( $new_instance['NumberPosts'] ) : '5';
        $instance['DisplayThumbnails'] = ( ! empty( $new_instance['DisplayThumbnails'] ) ) ? strip_tags( $new_instance['DisplayThumbnails'] ) : 'true';

        return $instance;
    }
}

$mcp_recentposts = new mcp_recentposts();
