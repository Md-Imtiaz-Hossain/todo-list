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
    <title>Todo Items</title>
</head>
<body>

<div align="center">

    <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
    <a href="${addUrl}"> New Item </a>

    <table border="1" cellpadding="5">

        <caption><h2>Todo Items</h2></caption>

        <tr>
            <th>Title</th>
            <th>Deadline</th>
            <th>Edit</th>
            <td>Delete</td>
        </tr>

        <c:forEach var="item" items="${todoData.items}">

            <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>

            <c:url var="editUrl" value="${Mappings.EDIT_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>


            <tr>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.deadline}"/></td>
                <td><a href="${editUrl}">Edit</a></td>
                <td><a href="${deleteUrl}">Delete</a></td>
            <tr/>

        </c:forEach>
    </table>
</div>

</body>
</html>
