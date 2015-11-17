<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 04:27 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <style type="text/css">
        label{
            float:left;
            width:65px;
        }
    </style>
</head>

<body>
    <g:form action="doLogin" style="padding-left: 200px" method="post">
    <div style="width: 220px">
        <label>Nombre usuario:</label><input type="text" name="username"/>
        <label>Contraseña:</label><input type="text" name="password"/>
        <label>&nbsp</label><input type="submit" name="Login"/>
    </div>
    </g:form>
</body>
</html>