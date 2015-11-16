<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 02:49 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Posts</title>
</head>

<body>
<label>Posts</label>
<g:each in="${postList}"  var="post">
    <li><g:link action="postLinks" id="${post.id}">${post.topic}</g:link></li>
</g:each>
</body>
</html>