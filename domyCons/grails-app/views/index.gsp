<%@ page import="domycons.Post" %>
<%--
  Created by IntelliJ IDEA.
  User: Stephanie
  Date: 16/11/2015
  Time: 07:04 PM
--%>
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>Forum 2.0</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'default1.css')}">
</head>
<body>
<div id="header">
	<h1><a href="#">Forum 2.0</a></h1>
	<h2>Login</h2>
</div>

<div id="content">
	<div id="posts">
		<div class="post">
			<h2 class="title">Bienvenido a Forum 2.0!</h2>

			<div id="contenido" class="obox">
				<h2 class="heading">Consulta:</h2>
				<div class="content">
					<ul>
						<li><a href="${createLink(controller: 'Forum', action: 'forumLinks')}">Foros</a></li>
						<li><a href="${createLink(controller: 'User', action: 'showUsers')}">Usuarios</a></li>
						<li><a href="${createLink(controller: 'Post', action: 'showPosts')}">Entradas (Post)</a></li>
						<li><a href="${createLink(controller: 'File',action: 'showFiles')}">Archivos</a></li>
					</ul>
				</div>
			</div>
		</div>

	</div>
	<div id="archives" class="obox">
		<h2 class="heading">Utimas entradas(Post)</h2>
		<div class="content">
			<ul>
			<g:each in="${ domycons.Post.list(params)}"  var="post">
				<li><g:link action="showPost" id="${post.id}" controller="Post">${post.topic}</g:link></li>
			</g:each>
			</ul>
		</div>
	</div>

	<div id="pages" class="gbox">
		<h2 class="heading">Foros con más entradas</h2>
		<div class="content">
			<ul>
				<g:each in="${ domycons.Forum.list(params)}"  var="forum">
					<li><g:link action="showForum" id="${forum.id}" controller="Forum">${forum.name}</g:link></li>
				</g:each>
			</ul>
		</div>
	</div>

	<div style="clear: both;">&nbsp;</div>
</div>
<div id="footer">
	<p>Aplicación desarrollada por APPet</p>
</div>
</body>
</html>
