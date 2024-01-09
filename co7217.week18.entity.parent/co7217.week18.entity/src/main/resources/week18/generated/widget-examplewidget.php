<?php
// Widget code for examplewidget here

class capi_examplewidget extends WP_Widget {
	public function __construct() {
		// actual widget processes

		parent::__construct(
			'examplewidget', // Base ID
			'ExampleWidget', // Name
			array( 'description' => __( 'default settings for widget', 'capi' ) ) // Args
		);

		add_action( 'widgets_init',  function() {
			register_widget( 'capi_examplewidget' );
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

$capi_examplewidget = new capi_examplewidget();

