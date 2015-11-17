<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 09:36 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Forum 2.0</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'default1.css')}">
</head>

<body>
<div id="header">
    <h1>Posts</h1>
</div>
<g:each in="${postList}"  var="post">
    <label>Post N ${post.id}</label>
    <li><label>Tema: ${post.topic}</label></li>
    <li><label>Fecha de creación: <g:formatDate format="yyyy-MM-dd" date="${post.dateCreate}"/></label></li>
    <li><label>Está permitido: ${post.itsAllowed}</label></li>
    <li><label>Comentarios: ${post.comments}</label></li>
    <li><label>Rate: ${post.rate}</label></li>
</g:each>
</body>
</html>