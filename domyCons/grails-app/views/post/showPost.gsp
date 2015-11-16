<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 10:14 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Post</title>
</head>

<body>
    <label>Post N ${post.id}</label>
    <li><label>Tema: ${post.topic}</label></li>
    <li><label>Fecha de creación: <g:formatDate format="yyyy-MM-dd" date="${post.dateCreate}"/></label></li>
    <li><label>Está permitido: ${post.itsAllowed}</label></li>
    <li><label>Comentarios: ${post.comments}</label></li>
    <li><label>Rate: ${post.rate}</label></li>
</body>
</html>