$(document).ready(function (argument) {
  // body...
  var Ymenu, Yscroll, heder;
  function y(argument) {
     // body...
     Ymenu = $('ul').offset().top;
     heder=$('ul').outerHeight(true);
   } 
   y();


   $(window).resize(y);
   $('<nav class="clone"></nav>').insertBefore('ul').css('heigth', heder).hide();

   function scY(argument) {
     // body...
     Yscroll = $(window).scrollTop();
     if (Yscroll>=Ymenu) {
      $('ul').addClass('fixed');
      $('.clone').show();
     } else {
      $('ul').removeClass("fixed");
      $('.clone').hide();
     }
   }
   scY();
   $(window).scroll(scY);

 

});