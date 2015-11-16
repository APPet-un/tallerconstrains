<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 03:18 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Admins</title>
</head>

<body>
<label>Usuarios</label>
<g:each in="${userList}"  var="user">
    <li><g:link action="showUser" id="${user.id}">${user.name}</g:link>${user.class.name}</li>
</g:each>
</body>
</html>