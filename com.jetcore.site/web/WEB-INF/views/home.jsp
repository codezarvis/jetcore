<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>jetCore | Home</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/redmond/jquery-ui-1.10.3.custom.css">
            <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery-ui-1.10.3.custom.min.js"></script>

            <script type="text/javascript" charset="utf-8">
                // <![CDATA[
                $(document).ready(function() {
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
                            height: 360,
                            width: 350,
                            modal: true,
                            resizable: false,
                            hide: "explode",
                            show: "bounce",
                            buttons: {
                                "Sign In": function() {
                                    var bValid = true;
                                    allFields.removeClass("ui-state-error");
                                    bValid = bValid && checkLength(name, "username", 3, 20);
                                    bValid = bValid && checkLength(password, "password", 3, 20);


                                    if (bValid) {


                                        $('#ajax_loading').show();
                                        $.ajax({
                                            type: "POST",
                                            url: "${pageContext.request.contextPath}/login",
                                            data: $("#signForm").serialize(),
                                            success: function(response) {
                                                res = response;
                                                console.debug('In Success ...');
                                                console.debug($('#status'));
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
                    window.location = "${pageContext.request.contextPath}/admin";
                }
                // ]]>
            </script>
            <style type="text/css">
                body { font-size: 65.5%; }
                label, input { display:block; }
                input.text { margin-bottom:12px; width:95%; padding: .4em; }
                fieldset { padding:0; border:0; margin-top:25px; }
                h1 { font-size: 1.2em; margin: .6em 0; }
                div#users-contain { width: 350px; margin: 20px 0; }
                div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
                div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
                .ui-dialog .ui-state-error { padding: .3em; }
                .validateTips { border: 1px solid transparent; padding: 0.3em; }


                #notification_error {
                    color: red;
                    height: auto;
                    padding: 4px;
                    text-align: center;
                }

                #login_response {
                    overflow: auto;
                    color: #FF0000
                }

                #ajax_loading {
                    display: none;
                    font-size: 12px;
                    font-family: Tahoma;
                }

                #logged_in {
                    padding: 5px;
                    margin: 23px 0 100px 43px;
                    padding: 5px;
                    text-align: center;
                    width: 400px;
                }

                #status {
                    margin-top: 20px;
                    width: 310px;
                }
            </style>
    </head>
    <body>

        <p>
            <a href="#" id="signinLink">
                Sign In
            </a>
        </p>



        <div id="signInForm" style="display:none;">

            <p class="validateTips">All Field are required !</p>
            <span id="login_response"></span> 

            <div id="status" align="left">
                <sf:form method="POST" modelAttribute="loginForm" action="" id="signForm">
                    <fieldset>
                        <label for="email">E-Mail</label>
                        <sf:input type="text" name="name" id="name" path="email" cssClass="text ui-widget-content ui-corner-all" />
                        <label for="password">Password</label>
                        <sf:password type="password" name="password" id="password" path="password" value="" cssClass="text ui-widget-content ui-corner-all" />
                        <input type="hidden" id ="ctxPath" value="${pageContext.request.contextPath}"/>
                    </fieldset>
                    <div id="ajax_loading">
                        <img align="absmiddle" src="resources/assets/images/ajax-loader.gif">&nbsp;Processing...
                    </div>
                </sf:form>
            </div>


        </div>

    </body>
</html>