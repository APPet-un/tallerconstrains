<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 10:29 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Regular User</title>
</head>

<body>
<li><label>Usuario Regular N ${regular.id}</label>
<li><label>Nombre: ${regular.name}</label></li>
<li><label>Apellido: ${regular.lastName}</label></li>
<li><label>Edad: ${regular.age}</label></li>
<li><label>Nombre usuario: ${regular.username}</label></li>
<li><label>Contraseña: ${regular.password}</label></li>
<li><label>Post views: ${regular.postViews}</label></li>
<li><label>Strikes: ${regular.strikesNumber}</label></li>
<li><label>Stars: ${regular.starsNumber}</label></li>

</body>
</html>