<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 11:24 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Admins</title>
</head>

<body>
<label>Administradores</label>
<g:each in="${adminList}"  var="admin">
    <li><g:link action="showAdmin" id="${admin.id}">${admin.name}</g:link></li>
</g:each>
</body>
</html>