<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>jetCore | Home</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/redmond/jquery-ui-1.10.3.custom.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery-1.9.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery-ui-1.10.3.custom.min.js"></script>

        <style type="text/css">

            body{

                font: 70.5% "Trebuchet MS", sans-serif;}
            label, input { display:block; }
            input.text { margin-bottom:12px; width:95%; padding: .4em; }
            fieldset { padding:0; border:0; margin-top:25px; }
            h1 { font-size: 1.2em; margin: .6em 0; }
            div#users-contain { width: 350px; margin: 20px 0; }
            div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
            div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
            .ui-dialog .ui-state-error { padding: .3em; }
            .validateTips { border: 1px solid transparent; padding: 0.3em; }

            #appHome_Ajax_Loading {
                position: relative;
                top:0px;
                left:4px;
                width:100px;
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
                top:100px;
            }




        </style>

        <script>
            function showPage() {
                window.location = '${pageContext.request.contextPath}/admin';
            }
            $(document).ready(function() {



                $("#loginDialog").dialog({
                    autoOpen: false,
                    width: 400,
                    modal: true,
                    hide: 'explode',
                    resizable: false,
                    buttons: [
                        {
                            text: "Sign In",
                            click: function() {
                                //$('#appHome_Ajax_Loading').show();
                                $.ajax({
                                    type: 'POST',
                                    url: '${pageContext.request.contextPath}/login',
                                    data: $('#loginForm').serialize(),
                                    success: function(response) {
                                        if (response == "true") {
                                            $("#appHome_Ajax_Loading").hide();
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
                                            $("#loginDialog").dialog({
                                                width: 480,
                                                height: 220
                                            });
                                            $('#loginDialog').html(login_response);
                                            setTimeout('showPage()', 3000);
                                        } else {
                                            $("#appHome_Ajax_Loading").hide();
                                            alert("Invalid");
                                        }

                                    },
                                    beforeSend: function() {
                                        $("#appHome_Ajax_Loading").css('display', 'inline', 'important');
                                    }

                                });
                            }
                        },
                        {
                            text: "Cancel",
                            click: function() {

                                $('#appHome_Ajax_Loading').hide();
                            }
                        }
                    ]
                });
                $('#linkLogin').click(function(event) {
                    $("#loginDialog").dialog("open");
                    $("#loginDialog").dialog("option", "position", 'center');
                    event.preventDefault();
                });
            });



        </script>


    </head>
    <body>

        <a href="#" id="linkLogin">Login</a>

        <div id="loginDialog" title="jetCore Login">
            <p class="validateTips">All form fields are required.</p>
            <span id="login_response"></span>

            <sf:form id="loginForm" modelAttribute="loginForm">
                <fieldset>
                    <label for="email">Email</label>
                    <sf:input type="text" name="email" id="email" value="" path="email" cssClass="text ui-widget-content ui-corner-all" />
                    <label for="password">Password</label>
                    <sf:input type="password" name="password" id="password" value="" path ="password" cssClass="text ui-widget-content ui-corner-all" />
                </fieldset>
                <div id="appHome_Ajax_Loading">
                    <img align="absmiddle" src="resources/assets/images/ajax-loader.gif">&nbsp;Processing...
                </div>
            </sf:form>

        </div>

    </body>
</html>