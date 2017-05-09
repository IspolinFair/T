

jQuery(document).ready(function (argument) {
	// body...
	jQuery('span').click(function (argument) {
		// body...
		$("li").slideToggle();

	});
	 $(window).resize(function() {		
		if (  $(window).width() > 500 ) {			
			$('li').removeAttr('style');
		 }
	});

});