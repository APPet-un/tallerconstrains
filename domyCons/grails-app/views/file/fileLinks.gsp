<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 02:19 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Files</title>
</head>

<body>
<label>Archivos</label>
<g:each in="${fileList}"  var="file">
    <li><g:link action="showFile" id="${file.id}">${file.id}</g:link>${file.fileType}</li>
</g:each>
</body>
</html>