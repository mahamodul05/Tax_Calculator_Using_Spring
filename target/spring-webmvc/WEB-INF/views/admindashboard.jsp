<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 27/12/2022
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.domain.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<%
    User user = (User) session.getAttribute("user");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="icon" href="resources/Images/ulogo.jpg" type="image/icon type">

    <style type="text/css">

        body{
            margin: 0; height: 100%; overflow: hidden;

        }
        .col-md-12{
            margin-top: 200px;
        }

    </style>

    <style>
        body {
            background-image: linear-gradient(rgb(103 78 78 / 45%), rgb(24 13 13 / 56%)),url('resources/Images/Home2.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
    </style>
</head>
<body>
<div>
    <h1 align="center"> <%//=user.getName()%>You are Warmly Welcome to Calculator your income Tax</h1>
</div>



<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">

        <p align="middle">
            <a class="btn btn-danger btn-lg" onclick="window.location.href='logout'; return false;">Logout</a>
            <a class="btn btn-primary btn-lg" onclick="window.location.href='catagory'; return false;">Update Catagory value</a>
            <a class="btn btn-primary btn-lg" onclick="window.location.href='zone'; return false;">Update Zone Value</a>
        </p>
    </div>
    <div class="col-md-2"></div>
</div>

<br><br>


</body>
</html>
