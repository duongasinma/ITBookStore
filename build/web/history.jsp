<%-- 
    Document   : history
    Created on : Jun 9, 2021, 9:30:32 PM
    Author     : DUONGAS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <title>JSP Page</title>
        <!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js">
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
                <link rel="stylesheet" href="css/history.css">-->
    </head>
    <body>
        <jsp:include page="header.jsp"/>       
        <div class="container rounded mt-5 bg-white p-md-5">
            <div class="h2 font-weight-bold">HISTORY</div>
            <div class="table-responsive">
                <c:set var="listOrder" value="${requestScope.ORDER}"/>
                <c:if test="${not empty listOrder}">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Date</th>
                                <th scope="col">Total</th>
                                <th scope="col">View</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="order" items="${listOrder}">
                            <form action="MainController">
                                <tr class="bg-blue">
                                    <td class="pt-2">
                                        <input type="hidden" name="txtOrderId" value="${order.orderId}" />
                                        <div class="pl-lg-5 pl-md-3 pl-1 name">${order.orderId}</div>
                                    </td>
                                    <td class="pt-3 mt-1">${order.date}</td>
                                    <td class="pt-3">${order.total}</td>

                                    <td class="pt-3"><button  type="submit" class="fa fa-ellipsis-v btn" name="btAction" value="view detail"></button></td>
                                </tr>
                                <tr id="spacing-row">
                                    <td></td>
                                </tr> 
                            </form>
                        </c:forEach>

                        </tbody>
                    </table>
                </c:if>
                <c:if test="${empty listOrder}">
                    <h2 style="align-content: center">No History</h2>
                </c:if>
            </div>
        </div>

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
