<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Save Customer</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/webapp/WEB-INF/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/webapp/WEB-INF/css/add-customer-style.css">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <h3>Save Customer</h3>

    <form:form action="save" modelAttribute="customer" method="POST">

        <!-- need to associate this data with customer id -->
        <form:hidden path="id" />

        <table>
            <tbody>
            <tr>
                <td><label>First name:</label></td>
                <td><form:input path="firstName" /></td>
            </tr> <form:errors path="firstName" cssClass="error-label"/>

            <tr>
                <td><label>Last name:</label></td>
                <td><form:input path="lastName" /></td>
            </tr><form:errors path="lastName" cssClass="error-label"/>

            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" /></td>
            </tr><form:errors path="email" cssClass="error-label"/>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>


            </tbody>
        </table>


    </form:form>
    <p>
        <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
    </p>

</div>

</body>

</html>

