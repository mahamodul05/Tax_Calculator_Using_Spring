<%@ page import="com.domain.Catagory" %>
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
    <title>Update Zone</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/Studentprofile.css"/>

</head>
<body>

<form action="updatezone" method="post" novalidate>
    <div class="container rounded bg-white mt-5 mb-5">
        <div class="row">
            <div class="col-md-3 border-right">
                <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5"
                                                                                             width="150px"
                                                                                             src="https://cdn-icons-png.flaticon.com/512/727/727399.png?w=740&t=st=1672175974~exp=1672176574~hmac=7fa2883f427725b5cbfa9c351610c4f3e461ac02b5a2dfaa994702fb487cbfb6"><span
                        class="font-weight-bold"><%//=student.getStudentName()%></span><span
                        class="text-black-50"><%//=student.getStudentemaIL()%></span><span> </span></div>
            </div>
            <div class="col-md-5 border-right">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <h4 class="text-right">Update Zone</h4>
                    </div>
                    <div class="row mt-1">
                        <div class="col-md-6"><label class="labels">Dhaka/Chattagram City</label><input type="text" class="form-control"
                                                                                       name="dhaka"
                                                                                       value="<%=zone.getDhaka()%>" >
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-md-6"><label class="labels">Other city</label><input type="text" class="form-control"
                                                                                       name="other"
                                                                                       value="<%=zone.getOther()%>" >
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-md-12"><label class="labels">Rest of the Country</label><input type="text" name="rest"
                                                                                              class="form-control"
                                                                                              value="<%=zone.getRest()%>">
                        </div>
                    </div>


                        <input type="hidden" name="id"
                               class="form-control"
                               value="<%=zone.getId()%>">



                        <div class="mt-5 text-center">
                            <button type="submit" class="btn btn-primary profile-button">Update Zone</button>
                        </div>


                    </div>
                </div>
            </div>
        </div>
    </div>





</form>
<%
    //  if (student.getStudentIsActive() == 1) {
%>
<script>
    document.getElementById("labelac").innerHTML = "Active";
    document.getElementById("labelac").style.color = "green"
</script>
<%//
//} //else {
%>
<script>
    document.getElementById("labelac").innerHTML = "Not Active"
    document.getElementById("labelac").style.color = "red"
</script>

<%
    //}
%>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
