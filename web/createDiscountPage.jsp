<%-- 
    Document   : createDiscountPage
    Created on : Jun 8, 2021, 3:55:06 PM
    Author     : DUONGAS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Discount Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 500px;
                height: 500px;
            }
            body{
  background:while;
}
        </style>
    <body>
        <c:if test="${not empty requestScope.OK}">
            <script>
                swal("${requestScope.OK}", "You clicked the button!", "success");
            </script>
        </c:if>
        <div class="container">
            <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="LoadAllBookController">Home</a></li>
                        <li class="active">Discount</li>
                    </ol>
                </div><!--/breadcrums-->
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Edit <b>Product</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="MainController" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Create Discount Code</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true" value="exit">&times;</button>
                            </div>
                            <div class="modal-body">
                                <div class="form-group">
                                    <label>Code</label>
                                    <input value="" name="txtCode" type="text" class="form-control" required="">
                                </div>
                                <div class="form-group">
                                    <label>Percent</label>
                                    <input value="" name="txtPercent" type="number" class="form-control" required="">
                                </div>
                                <div class="form-group">
                                    <label>End Date</label>
                                    <input value="" name="txtEndDate" type="date" class="form-control" required="">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="submit" name="btAction" class="btn btn-success" value="Create">
                                <input type="submit" name="btAction" class="btn btn-success" value="Cancel">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>


        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>
