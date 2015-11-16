<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 15/11/2015
  Time: 11:20 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>File N ${file.id}</title>
</head>

<body>
    <li><label>Archivo N ${file.id}</label></li>
    <li><label>Tipo de archivo: ${file.content}</label></li>
    <li><label>Tamaño: ${file.size}</label></li>
</body>
</html>