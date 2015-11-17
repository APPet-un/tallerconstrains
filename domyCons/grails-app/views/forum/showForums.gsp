<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 09:17 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Forum</title>
</head>
    <g:each in="${forumList}"  var="forum">
        <label>Foro N ${forum.id}</label>
        <li><label>Nombre: ${forum.name}</label></li>
        <li><label>Fecha de creación: <g:formatDate format="yyyy-MM-dd" date="${forum.dateCreate}"/></label></li>
        <li><label>Categoría: ${forum.category}</label></li>
        <li><label>Administrador: ${forum.admin.name}</label></li>
    </g:each>
</body>
</html>