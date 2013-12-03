<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>jetCore | Home</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/redmond/jquery-ui-1.10.3.custom.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/jetcore.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
        <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/assets/js/jetcore.js"></script>

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