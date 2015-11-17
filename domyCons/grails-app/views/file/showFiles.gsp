<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 09:39 PM
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
    <h1>Archivos</h1>
</div>
    <g:each in="${fileList}"  var="file">
        <li><label>Archivo N ${file.id}</label></li>
        <li><label>Tipo de archivo: ${file.content}</label></li>
        <li><label>Tamaño: ${file.size}</label></li>
    </g:each>
    <div id="col2" class="gbox">
    <div id="col3" class="gbox">
</body>
</html>