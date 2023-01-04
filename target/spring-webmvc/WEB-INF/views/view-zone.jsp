<%@ page import="com.domain.Zone" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<%
    Zone zone = (Zone) session.getAttribute("zone");
%>

<html>
<head>
    <title>View Zone</title>
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
    <h2>View Zone</h2>
</div>


<div id="container">

    <div id="content">




        <table>
            <tr>
                <th>Dhaka/Chattagram City</th>
                <th>Other city</th>
                <th>Rest of the Country</th>
            </tr>


            <tr>
                <td> ${zone.dhaka} </td>
                <td> ${zone.other} </td>
                <td> ${zone.rest} </td>
            </tr>



        </table>

    </div>

</div>










</body>
</html>
