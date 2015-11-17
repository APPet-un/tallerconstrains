<%--
  Created by IntelliJ IDEA.
  User: Alvaro
  Date: 15/11/2015
  Time: 11:25 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="index"/>
    <title>User R Prof</title>
</head>
<body>
<div class="container" style="border: 1px solid black; border-top: 0; padding: 2%">
    <div class="col-md-12" style="border: 1px solid black; height: 50%; padding: 1%">
        <div class="row center-block" style="width: 50%; text-align: center; padding-top: 10%">
            Perfil de Usuario<br><br>
            Tipo de Usuario: Regular<br>
            Vistas de Post: ${regular.postViews}<br>
            Strikes: ${regular.strikesNumber}<br>
            Estrellas: ${regular.startNumber}<br>
        </div>
    </div>
</div>
</body>
</html>
