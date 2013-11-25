<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>jetCore | Home</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/redmond/jquery-ui-1.10.3.custom.min.css">
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

        </style>

        <script>
            $(document).ready(function() {

                $("#loginDialog").dialog({
                    autoOpen: false,
                    width: 400,
                    position:'center',
                    modal: true,
                    hide: 'explode',
                    resizable: false,
                    buttons: [
                        {
                            text: "Sign In",
                            click: function() {
                              $.ajax({
                                 type:'POST' ,
                                 url:'',
                                 data:$('#loginForm').serialize(),
                                 success: function(response) {
                                     alert(response);
                                 }
                                  
                              }) ;
                            }
                        },
                        {
                            text: "Cancel",
                            click: function() {
                                $(this).dialog("close");

                            }
                        }
                    ]
                });

                $('#linkLogin').click(function(event) {
                    $("#loginDialog").dialog("open");
                    event.preventDefault();
                });

            });



        </script>


    </head>
    <body>

        <a href="#" id="linkLogin">Login</a>

        <div id="loginDialog" title="jetCore Login">
            <p class="validateTips">All form fields are required.</p>

            <sf:form id="loginForm" modelAttribute="loginForm">
                <fieldset>
                    <label for="email">Email</label>
                    <sf:input type="text" name="email" id="email" value="" path="email" cssClass="text ui-widget-content ui-corner-all" />
                    <label for="password">Password</label>
                    <sf:input type="password" name="password" id="password" value="" path ="password" cssClass="text ui-widget-content ui-corner-all" />
                </fieldset>
            </sf:form>
        </div>

    </body>
</html>