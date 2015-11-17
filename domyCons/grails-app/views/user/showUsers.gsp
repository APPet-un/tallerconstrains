<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 09:31 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'default1.css')}">
</head>

<body>
<div id="header">
    <h1>Users</h1>
</div>

<div id="content">

<div id="users" class="obox">
    <g:each in="${userList}"  var="user">
        <ul><li><label>Tipo de usuario N ${user.class.name.toString()}</label></ul>
        <li><label>Nombre de usuario: ${user.username}</label></li>
        <li><label>Nombre: ${user.name}</label></li>
        <li><label>Apellido: ${user.lastName}</label></li>
        <li><label>Edad: ${user.age}</label></li>
    </g:each>
</div>
    <div id="col2" class="gbox">
        <div id="col3" class="gbox">
</div>

</body>
</html>

