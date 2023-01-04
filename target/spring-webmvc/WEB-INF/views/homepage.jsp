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
    <title>Homepage</title>
</head>
<body>
<div>
    <h1 align="center"> <%//=user.getName()%>, You are Warmly Welcome to Calculator your income Tax</h1>
</div>

<br><br>

<button><a onclick="window.location.href='logout'; return false;">Logout</a></button>

<br><br>
<br><br>

<button><a onclick="window.location.href='taxcalculate'; return false;">Go to calculate Tax</a></button>

<br><br>
<br><br>

<button><a onclick="window.location.href='taxhistory'; return false;">History</a></button>


</body>
</html>
