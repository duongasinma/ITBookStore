<%-- 
    Document   : detailPage
    Created on : Jun 10, 2021, 4:00:42 PM
    Author     : DUONGAS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Cart | IT-Shopper</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head><!--/head-->

    <body>
        <jsp:include page="header.jsp"/>
        <c:set var="cart" value="${sessionScope.CART}" />
            <section id="cart_items">
                <div class="container">
                    <div class="breadcrumbs">
                        <ol class="breadcrumb">
                            <li><a href="#">Home</a></li>
                            <li class="active">Shopping Cart</li>
                        </ol>
                    </div>
                    <div class="table-responsive cart_info">

                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Item</td>
                                    <td class="description"></td>
                                    <td class="price">Price</td>
                                    <td class="quantity">Quantity</td>
                                    <td class="total">Total</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="detail" value="${requestScope.DETAIL}"/>
                                <c:forEach var="item" items="${detail}">
                                <form action="MainController">
                                    <tr>
                                        <td class="cart_product">
                                            <a href=""><img style="height: 100px; width: 75px;" src="${item.bookImg}" alt=""></a>
                                        </td>
                                        <td class="cart_description">
                                            <h4><a href="">${item.bookTitle}</a></h4>
                                            <p>Web ID: 1089772</p>
                                        </td>
                                        <td class="cart_price">
                                            <p>${item.price}</p>
                                        </td>
                                        <td class="cart_quantity">
                                            <div class="cart_quantity_button">
                                                <input class="cart_quantity_input" type="text" name="quantity" value="${item.quantity}" autocomplete="off" size="2">
                                            </div>
                                        </td>
                                        <td class="cart_total">
                                            <p class="cart_total_price">${item.quantity * item.price}</p>
                                        </td>
                                    </tr>
                                </form>
                            </c:forEach>
                            </tbody>
                        </table>

                    </div>
                </div>
            </section> <!--/#cart_items-->
            <c:set var="user" value="${sessionScope.NAME}" />
            <section id="do_action">
                <form action="MainController">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="chose_area">
                                    <ul class="user_info">
                                        <li class="single_field">
                                            <label>Address</label>
                                            <input type="text" value="${user.address}" name="txtAddress">
                                        </li>
                                        <li class="single_field">
                                            <label>Phone</label>
                                            <input type="text" value="${user.phone}" name="txtPhone">                                       
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="total_area">
                                    <ul>
                                        <li>Cart Sub Total <span ></span></li>
                                        <li>Discount <span></span></li>
                                        <li>Shipping Cost <span>Free</span></li>
                                        <li>Total <span></span></li>
                                    </ul>                                
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </section><!--/#do_action-->
        <jsp:include page="footer.jsp"/>

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
