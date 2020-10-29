<%--
  Created by IntelliJ IDEA.
  User: Imtiaz
  Date: 10/26/2020
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.imtiaz.util.Mappings" %>



<html>
<head>
    <title>View Items</title>
</head>
<body>

<div align="center">


    <table >

        <tr>
            <td><label>Id</label></td>
            <td><c:out value="${todoItem.id}"/></td>
        </tr>

        <tr>
            <td><label>Title</label></td>
            <td><c:out value="${todoItem.title}"/></td>
        </tr>

        <tr>
            <td><label>Deadline</label></td>
            <td><c:out value="${todoItem.deadline}"/></td>
        </tr>

        <tr>
            <td><label>Details</label></td>
            <td><c:out value="${todoItem.details}"/></td>
        </tr>

    </table>

    <c:url var="tableUrl" value="${Mappings.ITEMS}"/>
    <a href="${tableUrl}"> Show Table </a>

</div>

</body>
</html>
