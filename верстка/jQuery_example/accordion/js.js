$(document).ready(function (argument) {
  // body...
  $('p').not(':first').hide();
 
  $("span").click(function (argument) {
     var frend = $(this).next("p");
  var parent = $(this).closest("ul");
    // body...
    if (frend.is(":visible")) {
      frend.slideUp();
    } else {
      parent.find("p").slideUp();
      frend.slideDown();

    }
  });
});
