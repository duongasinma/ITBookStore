<%-- 
    Document   : cart
    Created on : Jun 5, 2021, 11:16:25 PM
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
        <c:if test="${not empty cart}">
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
                                <c:set var="quantityErr" value="${requestScope.QUANTITY_ERROR}"/>
                                <c:forEach var="item" items="${cart.items}">
                                <form action="MainController">
                                    <tr>
                                        <td class="cart_product">
                                            <a href=""><img style="height: 100px; width: 75px;" src="${item.value.img}" alt=""></a>
                                        </td>
                                        <td class="cart_description">
                                            <h4><a href="">${item.value.title}</a></h4>
                                            <p>Web ID: 1089772</p>
                                        </td>
                                        <td class="cart_price">
                                            <p>${item.value.price}</p>
                                        </td>
                                        <td class="cart_quantity">
                                            <div class="cart_quantity_button">
                                                <a class="cart_quantity_up" href="MainController?btAction=update cart quantity&txtSign=p&txtId=${item.value.id}"> + </a>
                                                <input class="cart_quantity_input" type="text" name="quantity" value="${item.value.quantity}" autocomplete="off" size="2">
                                                <c:if test="${not empty quantityErr}">
                                                    <c:forEach var="quan" items="${quantityErr}">
                                                        <c:if test="${quan eq item.value.id}">
                                                            <font color="red">The quantity is out of stock</font>
                                                        </c:if>
                                                    </c:forEach>
                                                </c:if>
                                                <a class="cart_quantity_down" href="MainController?btAction=update cart quantity&txtSign=m&txtId=${item.value.id}"> - </a>
                                            </div>
                                        </td>
                                        <td class="cart_total">
                                            <p class="cart_total_price">${item.value.quantity * item.value.price}</p>
                                        </td>
                                        <td class="cart_delete">
                                            <a class="cart_quantity_delete" href="MainController?btAction=deleteCart&deleteItem=${item.value.id}"><i class="fa fa-times"></i></a>
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
                                        <c:set var="err" value="${requestScope.ERROR}" />
                                        <li class="single_field">
                                            <label>Address</label>
                                            <input type="text" value="${user.address}" name="txtAddress">
                                            <c:if test="${not empty err.titleErr}">
                                                <font color="red">${err.titleErr}</font>
                                            </c:if>
                                        </li>
                                        <li class="single_field">
                                            <label>Phone</label>
                                            <input type="text" value="${user.phone}" name="txtPhone">                                       
                                            <c:if test="${not empty err.categoryErr}">
                                                <font color="red">${err.categoryErr}</font>
                                            </c:if>

                                        </li>
                                        <li class="single_field zip-field">
                                            <label>Zip Code:</label>
                                            <input type="text" name="txtCode" value="${param.txtCode}" >
                                            <c:set var="discount" value="${requestScope.DISCOUNT}"/>
                                            <c:if test="${not empty discount}">
                                                <font color="green">Valid!</font>
                                            </c:if>
                                            <c:set var="disErr" value="${requestScope.CODE_ERR}"/>
                                            <c:if test="${not empty disErr}">
                                                <font color="red">${disErr}</font>
                                            </c:if>
                                        </li>
                                    </ul>
                                    <input class="btn btn-default update"  type="submit" value="Use code" name="btAction"/>

                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="total_area">
                                    <ul>
                                        <input type="hidden" name="txtTotal" value="${cart.total-(discount.percent/100)*cart.total}" />
                                        <input type="hidden" name="txtDiscount" value="${requestScope.DISCOUNT}" />

                                        <li>Cart Sub Total <span >${cart.total}</span></li>
                                        <li>Discount <span>${-(discount.percent/100)*cart.total}</span></li>
                                        <li>Shipping Cost <span>Free</span></li>
                                        <li>Total <span>${cart.total-(discount.percent/100)*cart.total}</span></li>
                                    </ul>                                
                                    <input class="  update" style="border-radius: 50 "  onclick="return confirm('Do you want to buy')" type="submit" value="Buy" name="btAction" />
                                    <hr/>
                                    <a id="paypal-button-container"></a>
                                    <input style="display: none" type="submit" name="btAction" id="ppButton" value="Buy">
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </section><!--/#do_action-->
        </c:if>
        <c:if test="${ empty cart}">
            <h2 style="text-align: center">No Product In Cart</h2>
        </c:if>
        <jsp:include page="footer.jsp"/>
        <script src="https://www.paypal.com/sdk/js?client-id=Absov9goL_ip7aKkgwquvuiFxz6ZcMPK4ApN_vd-McnPua7ZX6SIRptwTkoM6wu7RtYB1Yx27snxhLFs"></script>
        <script>
            
                paypal.Buttons({
                    
                    style: {
                        color: 'blue',
                        shape: 'pill'
                    },
                    createOrder: function (data, actions) {
                        //Hàm này thiết lập chi tiết của giao dịch, bao gồm số tiền và chi tiết mục hàng. 
                        return actions.order.create({
                            purchase_units: [{
                                    amount: {
                                        value: '${cart.total-(discount.percent/100)*cart.total}'
                                    }
                                }]
                        });
                    },
                    onApprove: function (data, actions) {
                        // Chức năng này thu tiền từ giao dịch.
                        return actions.order.capture().then(function (details) {
                            // Chức năng này hiển thị thông báo giao dịch thành công cho người mua của bạn.
                            document.getElementById("ppButton").click();
                        });
                    }
                }).render('#paypal-button-container');
                //Chức năng này hiển thị các Nút thanh toán thông minh trên trang web của bạn.  


        </script>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
