<%-- 
    Document   : updateBook
    Created on : Jun 1, 2021, 5:04:43 PM
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
        <title>Creating Book | IT-Shopper</title>
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


        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="LoadAllBookController">Home</a></li>
                        <li class="active">Check out</li>
                    </ol>
                </div><!--/breadcrums-->

                <c:set var="book" value="${requestScope.BOOK_DETAIL}"/>
                <div class="shopper-informations">
                    <div class="row">
                        <form action="MainController">
                            <c:if test="${not empty book}">
                                <div class="col-sm-3">
                                    <div class="view-product">
                                        <img src="${book.img}" alt="" />
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="shopper-info ">
                                        <p>Shopper Information</p>
                                        <c:set var="err" value="${requestScope.ERROR}" />
                                        <p>ID<br><input  type="text" placeholder="" name="txtId" value="${book.id}" ></p>

                                        <p>Title<input type="text" placeholder="" name="txtTitle" value="${book.title}"></p>

                                        <p>Image source<input type="text" placeholder="" name="txtImg" value="${book.img}"></p>

                                        <p>Quantity<input type="text" placeholder="" name="txtQuantity" value="${book.quantity}"></p>

                                        <p>Price<input type="text" placeholder="" name="txtPrice" value="${book.price}"></p>

                                        <p>Author<input type="text" placeholder="" name="txtAuthor" value="${book.author}"></p>

                                        <p>Category<input type="text" placeholder="" name="txtCategory" value="${book.category}">  </p>
                                        <a><input type="submit" class="btn btn-primary" value="update" name="btAction" /></a>
                                        <a><input type="reset" class="btn btn-primary" value="Reset"/></a>
                                    </div>
                                        <c:if test="${not empty requestScope.OK}">
                                            <font color="green">${OK}</font>
                                        </c:if>
                                </div>
                                <div class="col-sm-4">
                                    <div class="order-message">
                                        <p>Description</p>
                                        <textarea name="txtDescription"  placeholder="Notes about your order, Special Notes for Delivery"  rows="16">${book.description}</textarea>                                   
                                    </div>	
                                </div>	
                            </c:if>
                            <%-- Error update --%>   
                            <c:if test="${empty book}">
                                <div class="col-sm-3">
                                    <div class="view-product">
                                        <img src="${param.txtImg}" alt="NOT IMAGE" />

                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="shopper-info ">
                                        <p>Shopper Information</p>
                                        <c:set var="err" value="${requestScope.ERROR}" />
                                        <p>ID<br><input  type="text" placeholder="" name="txtId" value="${param.txtId}" ></p>
                                            <c:if test="${not empty err.idErr}">
                                            <font color="red">${err.idErr}</font>
                                        </c:if>
                                        <p>Title<input type="text" placeholder="" name="txtTitle" value="${param.txtTitle}"></p>
                                            <c:if test="${not empty err.titleErr}">
                                            <font color="red"> ${err.titleErr} </font>
                                        </c:if>
                                        <p>Image source<input type="text" placeholder="" name="txtImg" value="${param.txtImg}"></p>
                                            <c:if test="${not empty err.imgErr}">
                                            <font color="red">${err.imgErr}</font>
                                        </c:if>
                                        <p>Quantity<input type="text" placeholder="" name="txtQuantity" value="${param.txtQuantity}"></p>
                                            <c:if test="${not empty err.quantityErr}">
                                            <font color="red">${err.quantityErr}</font>
                                        </c:if>
                                        <p>Price<input type="text" placeholder="" name="txtPrice" value="${param.txtPrice}"></p>
                                            <c:if test="${not empty err.priceErr}">
                                            <font color="red">${err.priceErr}</font>
                                        </c:if>
                                        <p>Author<input type="text" placeholder="" name="txtAuthor" value="${param.txtAuthor}"></p>
                                            <c:if test="${not empty err.authorErr}">
                                            <font color="red">${err.authorErr}</font>
                                        </c:if>
                                        <p>Category<input type="text" placeholder="" name="txtCategory" value="${param.txtCategory}">  </p>    
                                            <c:if test="${not empty err.categoryErr}">
                                            <font color="red">${err.categoryErr}</font> <br>
                                        </c:if>

                                        <a><input type="submit" class="btn btn-primary" value="update" name="btAction" /></a>

                                        <a><input type="reset" class="btn btn-primary" value="Reset"/></a>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="order-message">
                                        <p>Description</p>
                                        <textarea name="txtDescription"  placeholder="Notes about your order, Special Notes for Delivery"  rows="16">${param.txtDescription}</textarea>                                   
                                    </div>	
                                </div>	
                            </c:if>
                        </form>
                    </div>
                </div>
            </div>
        </section> <!--/#cart_items-->



        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
