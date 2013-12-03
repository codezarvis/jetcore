var ctxPath = null;

$(document).ready(function() {
    ctxPath = $('#ctxPath').val();
   
    $("#signinLink").click(function() {
        var $dialog = $("#signInForm");
        $("#dialog:ui-dialog").dialog("destroy");

        var name = $("#name"),
        password = $("#password"),
        allFields = $([]).add(name).add(password),
        tips = $(".validateTips");
        
        function updateTips(t) {
            tips.text(t).addClass("ui-state-highlight");
            setTimeout(function() {
                tips.removeClass("ui-state-highlight", 1500);
            }, 500);
        }

        function checkLength(o, n, min, max) {
            if (o.val().length > max || o.val().length < min) {
                o.addClass("ui-state-error");
                updateTips("Length of " + n + " must be between " +
                        min + " and " + max + ".");
                return false;
            } else {
                return true;
            }
        }

        function checkRegexp(o, regexp, n) {
            if (!(regexp.test(o.val()))) {
                o.addClass("ui-state-error");
                updateTips(n);
                return false;
            } else {
                return true;
            }
        }

        $dialog.css('display', 'block');
        $dialog.dialog({
            title: "Sign In",
            height: 380,
            width: 350,
            modal: true,
            resizable: false,
            hide: "explode",
            show: "bounce",
            buttons: {
                "Sign In": function() {
                  var bValid = true;
                  allFields.removeClass("ui-state-error");
                  bValid = bValid && checkLength(name, "E-Mail", 3, 20);
                  bValid = bValid && checkLength(password, "Password", 3, 20);
                  
                  if (bValid) {
                   $('#ajax_loading').show();
                   $.ajax({
                    type: "POST",
                    url: ctxPath+'/login',
                    data: $("#signForm").serialize(),
                    success: function(response) {
                     res = response;
                     $("#status").ajaxComplete(function() {
                      $('#ajax_loading').hide();
                        if (response == 'true') {
                          $(".validateTips").hide();
                          $("#login_response").empty();
                            var login_response = '<div id="logged_in">'
                                + '<div style="width: 350px; float: left; margin-left: 70px;">'
                                + '<div style="width: 40px; float: left;">'
                                + '<img style="margin: 5px 5px 5px 0px;" src="resources/assets/images/spinner.gif">'
                                + '</div>'
                                + '<div style="margin: 5px 5px 5px 5px;width: 300px;color:#2A2A2A;font:18px Arial,Helvetica,sans-serif;">'
                                + "You are successfully logged in! <br /> Please wait while you're redirected...</div></div>";

                                $(".ui-widget-header").hide();
                                $(".ui-dialog-buttonpane").hide();
                                $("#signInForm").dialog({
                                  width: 500,
                                  height: 250
                                });
                                
                                $(this).html(login_response);
                                setTimeout('showPage()', 3000);
                         } else {
                           var login_response = 'Invalid UserName/Password !';
                           $("#login_response").css("display", "block");
                           $('#login_response').html(login_response);
                         }
                         return false;
                     });
                   }
                });
              }
            },
            Cancel: function() {
                $("#login_response").css("display", "none");
                $(this).dialog("close");
            }
            },
            close: function() {
                allFields.val("").removeClass("ui-state-error");
            }
          });
      $dialog.dialog('open');
      return false;
    });
});

function showPage() {
    window.location = ctxPath+'/admin';
}