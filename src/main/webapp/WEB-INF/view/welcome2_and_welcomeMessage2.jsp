<%--
  Created by IntelliJ IDEA.
  User: Imtiaz
  Date: 10/25/2020
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome2_and_welcomeMessage2</title>
</head>
<body>
        <h1> Hello ${user}</h1>          <%-- getting value from--> model.addAttribute("user", "Imtiaz");   --%>
       <h1>${welcomeMessage2}</h1>    <%-- calling method -->  @ModelAttribute("welcomeMessage2")--%>

        <h1>Finish</h1>
</body>
</html>
