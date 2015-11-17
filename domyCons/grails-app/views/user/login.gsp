<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 04:27 PM
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
<div id="content">

    <div id="login" class="obox">
    <g:form action="doLogin" style="padding-left: 200px" method="post">
    <div style="width: 220px">
        <label>Nombre usuario:</label><input type="text" name="username"/>
        <label>Contraseña:</label><input type="text" name="password"/>
        <label>&nbsp</label><input type="submit" name="Login"/>
    </div>
    </g:form>
    </div>
    </div>
</body>
</html>