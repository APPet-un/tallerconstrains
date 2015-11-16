<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 03:07 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Admins</title>
</head>

<body>
<label>Usuarios regulares</label>
<g:each in="${regularList}"  var="regular">
    <li><g:link action="showRegular" id="${regular.id}">${regular.name}</g:link></li>
</g:each>
</body>
</html>