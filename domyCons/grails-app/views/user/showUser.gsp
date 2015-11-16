<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 10:44 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Regular User</title>
</head>

<body>
    <li><label>Tipo de usuario N ${user.class}</label>
    <li><label>Nombre de usuario: ${user.username}</label></li>
    <li><label>Nombre: ${user.name}</label></li>
    <li><label>Apellido: ${user.lastName}</label></li>
    <li><label>Edad: ${user.age}</label></li>
    <li><label>Contraseña: ${user.password}</label></li>
</body>
</html>