<%--
  Created by IntelliJ IDEA.
  User: Imtiaz
  Date: 10/26/2020
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.imtiaz.util.AttributeNames" %>


<html>
<head>
    <title>Todo Items</title>
</head>
<body>

<div align="center">
    <%--@elvariable id="${AttributeNames.TODO_ITEM}" type="com"--%>
    <form:form method="POST" modelAttribute="${AttributeNames.TODO_ITEM}">
        <table>

            <tr>
                <td><label>ID</label></td>
                <td> <form:input path="id" disabled="true"/> </td>
            </tr>

            <tr>
                <td><label>Title</label></td>
                <td> <form:input path="title" /> </td>
            </tr>

            <tr>
            <td><label>Deadline</label></td>
            <td> <form:input path="deadline" /> </td>
            </tr>

            <tr>
                <td><label>Details</label></td>
                <td> <form:input path="details" /> </td>
            </tr>

            <tr>
                <td> <input type="submit" value="Submit"/> </td>
            </tr>

        </table>

    </form:form>

</div>

</body>
</html>
