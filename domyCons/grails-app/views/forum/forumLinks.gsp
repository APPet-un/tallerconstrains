<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 02:24 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Foros</title>
</head>

<body>
<label>Foros</label>
<g:each in="${forumList}"  var="forum">
    <li><g:link action="showForum" id="${forum.id}">${forum.name}</g:link></li>
</g:each>
</body>
</html>