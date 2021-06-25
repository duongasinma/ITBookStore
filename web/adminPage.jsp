<%-- 
    Document   : adminPage
    Created on : May 17, 2021, 11:19:09 AM
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
        <title>Home | IT-Shopper</title>
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

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Category</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-products-->



                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                Computer Science
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="womens" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
                                                <li><a href="#">Introduction to Computer Science</a></li>
                                                <li><a href="#">Introduction to Computer Programming</a></li>
                                                <li><a href="#">Algorithms and Data Structures</a></li>
                                                <li><a href="#">Artificial Intelligence</a></li>
                                                <li><a href="#">Computer Vision</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Operating System</a></h4>
                                    </div>
                                </div>

                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Programming/Scripting</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Mathematics</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="#">Supporting Fields</a></h4>
                                    </div>
                                </div>
                            </div><!--/category-products-->                     

                            <div class="price-range"><!--price-range-->
                                <h2>Price Range</h2>
                                <div class="well text-center">
                                    <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                                    <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                                </div>
                            </div><!--/price-range-->                            
                        </div>
                    </div>

                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">Features Items</h2>
                            <div class="col-sm-4">
                                <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                            <img src="https://image.flaticon.com/icons/png/512/1146/1146209.png" alt="" />
                                            <p>Click here</p>
                                        </div>
                                        <div class="product-overlay">
                                            <div class="overlay-content">

                                                <p>Something new?</p>
                                                <a href="createBook.jsp" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>ADD</a>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <c:set var="searchValue" value="${requestScope.SEARCH_VALUE}" />
                            <c:if test="${not empty searchValue}">
                                <c:set var="listBook" value="${requestScope.SEARCH_RESULT}"/>
                            </c:if>
                            <c:if test="${empty searchValue}">
                                <c:set var="listBook" value="${requestScope.BOOK}"/>
                            </c:if>
                            <c:if test="${not empty listBook}">
                                <c:forEach var="book" items="${listBook}">
                                    <div class="col-sm-4">
                                        <div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <img style="height:160px" src="${book.img}" alt="https://developers.google.com/maps/documentation/maps-static/images/error-image-generic.png?hl=vi" />
                                                    <p>${book.title}</p>
                                                    <h2>$${book.price}</h2>
                                                    <p>Quantity: ${book.quantity}</p>                                            
                                                </div>

                                            </div>
                                            <div class="choose">
                                                <ul class="nav nav-pills nav-justified">
                                                    <li><a href="MainController?btAction=showUpdatePage&txtId=${book.id}" ><i class="fa fa-plus-square"></i>Detail</a></li>
                                                    <li><a href="MainController?btAction=deleteBook&txtId=${book.id}&txtSearch=${searchValue}" onclick="return confirm('Do you want to delete')"><i class="fa fa-plus-square"></i>Delete</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </c:if>
                            <c:if test="${empty listBook}">
                                <h2>NO PRODUCT</h2>
                            </c:if>

                        </div><!--features_items-->                                              
                        <div class="pagination-area">
                            <ul class="pagination">
                                <li><a href="" class="active">1</a></li>
                                <li><a href="">2</a></li>
                                <li><a href="">3</a></li>
                                <li><a href=""><i class="fa fa-angle-double-right"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="footer.jsp"/>



        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
