<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 02:24 PM
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
<g:each in="${forumList}"  var="forum">
    <li><g:link action="showForum" id="${forum.id}">${forum.name}</g:link></li>
</g:each>
</body>
</html>