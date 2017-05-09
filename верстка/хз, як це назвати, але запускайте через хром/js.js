$(document).ready(function (argument) {
	// body...
	var forma = $('#form'),
		maxRadius = 50,
		minRadius = 0,
		testResult = $('#result');
    
    $('#plus').on('click', function (argument) {
    	// body...
    	var step = parseInt($('.step').val()),
    	curentForm = parseInt(forma.css('border-radius'));
    	var newForm = curentForm + step;
    	forma.css({
    		'border-radius' : newForm
    	}); 
    	if (newForm>maxRadius) {
    	forma.css({
    		'border-radius' : 50
    	}); 
    		$(this).addClass("disabled");
    	} 
    	if(newForm<maxRadius) {
    		$('#minus').removeClass('disabled');
    	} 	
 Text();

    });

    $('#minus').click(function (argument) {
    	// body...
    	var step = parseInt($('.step').val()),
    	curentForm = parseInt(forma.css('border-radius'));
    	var newForm = curentForm - step;
    	forma.css({
    		'border-radius' : newForm
    	}); 

    	if (newForm<minRadius) {
    	forma.css({
    		'border-radius' : 0
    	}); 
    		$(this).addClass("disabled");
    	} 

    	if(newForm<maxRadius) {
    		$('#plus').removeClass('disabled');
    	} 		
 Text();

    });

    //                                                                        Background

    $('#bg-color').on('change', function () {
    	// body...
    	var x = '#' + $(this).val();
    	$('#form').css('background', x);
    	 Text();

    });

    //                                                                          border-color

     $('#bg-radios').on('change', function () {
    	// body...
    	var x = '#' + $(this).val();
    	$('#form').css('border-color', x);
    	 Text();

    });


    var Text = function () {
    	// body..
    	var backGround = $('#form').css('background-color'),
    	borderColor  = $('#form').css('border-color')
    	borderRadius  = $('#form').css('border-radius');
    	$('#result').text(
    		'-moz-border-radius:' + borderRadius + ';\n' +
					'-webkit-border-radius:' + borderRadius + ';\n' +
					'border-radius:' + borderRadius + ';\n' +
					'border-color:' + borderColor + ';\n' + 
					'background-color:' + backGround + ';' 
    		);

    }
    Text();




});