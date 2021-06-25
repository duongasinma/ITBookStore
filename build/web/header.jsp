

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header id="header"><!--header-->
    <div class="header_top"><!--header_top-->
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="contactinfo">
                        <ul class="nav nav-pills">
                            <li><a href="#"><i class="fa fa-phone"></i> +84 343 439 333</a></li>
                            <li><a href="#"><i class="fa fa-envelope"></i> duongasinma@gmail.com</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->

    <div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-md-4 clearfix">
                    <div class="logo pull-left">
                        <a href="LoadAllBookController"><img src="https://t4.ftcdn.net/jpg/03/43/04/53/360_F_343045368_n3LSFIhqKOJsNHvz2qpzrW5jSefspR5S.jpg" alt="" /></a>
                    </div>
                </div>
                <div class="col-md-8 clearfix">
                    <div class="shop-menu clearfix pull-right">
                        <ul class="nav navbar-nav">
                            <li><a href=""><i class="fa fa-user"></i> Account</a></li>
                            <li><a href=""><i class="fa fa-star"></i> Wishlist</a></li>
                            <c:if test="${not sessionScope.NAME.isAdmin and not empty sessionScope.NAME.isAdmin}">
                                <li><a href="MainController?btAction=show history"><i class="fa fa-crosshairs"></i> History</a></li>
                            </c:if>
                            <c:if test="${not sessionScope.NAME.isAdmin}">
                                <li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart</a></li>
                            </c:if>
                            <c:set var="name" value="${sessionScope.NAME}"/>
                            <c:if test="${empty name}">
                                <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
                            </c:if>
                            <c:if test="${not empty name}">
                                <li class="mainmenu dropdown"><a href="#">${name.lastname}<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li ><a href="MainController?btAction=logout" style="background-color:rgba(0, 0, 0, 0.0);">Logout</a></li>                                 
                                    </ul>
                                </li> 
                            </c:if>    

                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom"><!--header-bottom-->
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="mainmenu pull-left">
                        <ul class="nav navbar-nav collapse navbar-collapse">
                            <li><a href="LoadAllBookController" class="active">Home</a></li>
                            <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="shop.html">Products</a></li>
                                    <li><a href="product-details.html">Product Details</a></li> 
                                    <li><a href="checkout.html">Checkout</a></li> 
                                    <li><a href="cart.html">Cart</a></li> 
                                    <li><a href="login.html">Login</a></li> 
                                </ul>
                            </li>
                            <c:if test="${name.isAdmin}">
                                <li><a href="createDiscountPage.jsp">Discount</a></li>
                            </c:if>
                            <li><a href="404.html">404</a></li>
                            <li><a href="contact-us.html">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <form action="MainController">
                        <div class="search_box pull-right">
                            <input type="text" placeholder="Search" name="txtSearch" value="${param.txtSearch}"/>
                        </div>
                        <input type="submit" class="pull-right btn btn-default got" value="search" name="btAction" />
                    </form>

                </div>
            </div>
        </div>
    </div><!--/header-bottom-->
</header><!--/header-->

