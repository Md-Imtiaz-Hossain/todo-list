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
        <h1>${name}</h1>          <%-- getting value from--> model.addAttribute("helloMessage", "demoService.getHelloMessage("Imtiaz")");   --%>
        <h1>${id}</h1>          <%-- getting value from--> model.addAttribute("helloMessage", "demoService.getHelloMessage("Imtiaz")");   --%>
       <h1>${age}</h1>    <%-- calling method -->  @ModelAttribute("welcomeMessage3")--%>

        <h1>w4_and_m4_fromInterface</h1>
</body>
</html>
