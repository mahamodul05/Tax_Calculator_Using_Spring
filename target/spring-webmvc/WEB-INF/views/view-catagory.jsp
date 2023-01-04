<%@ page import="com.domain.Catagory" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<%
    Catagory catagory = (Catagory) session.getAttribute("catagory");
%>

<html>
<head>
    <title>View Catagory</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,200;1,700&display=swap');

        h2{
            font-family: 'Roboto Mono', monospace;
        }
    </style>
</head>
<body>


<div id="ctitle">
    <h2>Tax Calculation History</h2>
</div>


<div id="container">

    <div id="content">




        <table>
            <tr>
                <th>General</th>
                <th>Female/Senior_citizen</th>
                <th>Disable</th>
                <th>Gazeted_Freedom_Fighter</th>
            </tr>


            <tr>
                <td> ${catagory.general} </td>
                <td> ${catagory.female} </td>
                <td> ${catagory.disable} </td>
                <td> ${catagory.general}</td>
            </tr>



        </table>

    </div>

</div>










</body>
</html>
