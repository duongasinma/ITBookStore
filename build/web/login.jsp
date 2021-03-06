<%-- 
    Document   : login
    Created on : May 14, 2021, 5:11:45 PM
    Author     : DUONGAS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <link href="css/login.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
        <meta name="google-signin-client_id" content="867045507245-28kke7nlbqd10j5naueh120updl140s9.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container-login">
            <section id="content-login">
                <form action="MainController" method="POST">
                    <h1>Login Form</h1>
                    <div>
                        <input type="text" placeholder="Username" required="" id="username" name="txtUsername" value="${param.txtUsername}"/>
                    </div>
                    <div>
                        <input type="password" placeholder="Password" required="" id="password" name="txtPassword" />
                    </div>
                    <div>
                        <c:if test="${not empty requestScope.LOGIN_INVALID}">
                            <font color="red">${requestScope.LOGIN_INVALID}</font>
                        </c:if>
                    </div>
                    <div>
                        <input type="submit" value="login" name="btAction" />
                        <h3><div class="g-signin2" data-onsuccess="onSignIn" ></div></h3>
                        <a href="#">Lost your password?</a>
                        <a href="#">Register</a>
                    </div>
                </form><!-- form -->

            </section><!-- content -->
        </div><!-- container -->
        <jsp:include page="footer.jsp"/>
        <script>
            function onSignIn(googleUser) {
                // Useful data for your client-side scripts:
                var auth2 = gapi.auth2.getAuthInstance();
                auth2.signOut().then(function () {
                    console.log('User signed out.');
                });
                var profile = googleUser.getBasicProfile();
                //singOut();
                window.location.href = 'MainController?btAction=loginGG&txtUsername=' + profile.getEmail() + '&txtLastname=' + profile.getName();
            }
            function signOut() {
            var auth2 = gapi.auth2.getAuthInstance();
            auth2.signOut().then(function () {
                console.log("User signed out");
            });
        }

        </script>
    </body>
</html>
