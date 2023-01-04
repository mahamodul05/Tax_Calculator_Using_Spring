<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 27/12/2022
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.domain.Inputdata" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<%
    Inputdata inputdata = (Inputdata) session.getAttribute("inputdata");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>


<br>

<button><a onclick="window.location.href='userlogout'; return false;">Logout</a></button>

<br><br>

<form method="post" action="taxcalculate" modelAttribute="tax">
    <label for="category">Choose Tax Payer Category</label><br>
    <select name="category" id="category">
        <option>General</option>
        <option>Female/Senior Citizen</option>
        <option>Disabled</option>
        <option>Gazetted Freedom Fighters</option>
    </select>
    <br><br>


    <label for="zone">Choose Zone</label><br>
    <select name="zone" id="zone">
        <option>Dhaka/Chattagram City</option>
        <option>Other City</option>
        <option>Rest of the Country</option>
    </select>
    <br><br><br>


    <label>Salary Breakdown</label><br>
    <table>
        <tr>
            <th>Area</th>
            <th>Amount</th>
        </tr>

        <tr>
            <td><label for="salary">Basic Salary</label></td>
            <td> <input type="number" name="salary" id="salary" value="0" required> </td>
        </tr>

        <tr>
            <td><label for="hrent">House Rent</label></td>
            <td> <input type="number" name="hrent" id="hrent" value="0" required> </td>
        </tr>

        <tr>
            <td><label for="med">Medical Allowance</label></td>
            <td> <input type="number" name="med" id="med" value="0" required> </td>
        </tr>

        <tr>
            <td><label for="con">Conveyance</label></td>
            <td> <input type="number" name="con" id="con" value="0" required> </td>
        </tr>

        <tr>
            <td><label for="ot">Incentive/OT</label></td>
            <td> <input type="number" name="ot" id="ot" value="0" required> </td>
        </tr>

        <tr>
            <td><label for="fbonus">Festival Bonous</label></td>
            <td> <input type="number" name="fbonus" id="fbonus" value="0" required> </td>
        </tr>
    </table>

    <br>
    <h3>Investment</h3>
    <table>
        <tr>
            <th><label for="invest">Investment Ammount</label></th>
            <td><input type="number" name="invest" id="invest" value="0" required></td>
        </tr>
    </table>
    <br>

    <input type="submit" name="submit" value="Calculate tax">


    <br><br><br>

</form>


</body>
</html>
