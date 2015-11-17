<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 09:17 PM
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
    <h1>Foros</h1>
</div>
<div id="content">
    <g:each in="${forumList}"  var="forum">
        <label>Foro N ${forum.id}</label>
        <li><label>Nombre: ${forum.name}</label></li>
        <li><label>Fecha de creación: <g:formatDate format="yyyy-MM-dd" date="${forum.dateCreate}"/></label></li>
        <li><label>Categoría: ${forum.category}</label></li>
        <li><label>Administrador: ${forum.admin.name}</label></li>
    </g:each>
</div>
    <div id="col2" class="gbox">
    <div id="col3" class="gbox">
</div>>
</body>
</html>