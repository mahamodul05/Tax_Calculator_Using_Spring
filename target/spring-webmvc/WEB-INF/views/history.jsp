<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 27/12/2022
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.domain.Taxhistory" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>



<%
    Taxhistory taxhistory = (Taxhistory) session.getAttribute("taxhistory");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
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
                <th>Total Amount</th>
                <th>Tax Payable Amount</th>
                <th>Yearly Tax Payable Amount</th>
                <th>Monthly Tax Payable Amount</th>
            </tr>


                <tr>
                    <td> ${taxhistory.totalamount} </td>
                    <td> ${taxhistory.taxpayable} </td>
                    <td> ${taxhistory.yearlytax} </td>
                    <td> ${taxhistory.monthlytax}</td>
                </tr>



        </table>

    </div>

</div>







</body>
</html>
