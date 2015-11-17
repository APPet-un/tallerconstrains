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
						<li><a href="${createLink(controller: 'Forum', action: 'showForums')}">Foros</a></li>
						<li><a href="#">Usuario</a></li>
						<li><a href="#">Entradas (Post)</a></li>
						<li><a href="#">Archivos</a></li>

					</ul>
				</div>
			</div>
		</div>

	</div>
	<div id="archives" class="obox">
		<h2 class="heading">Utimas entradas(Post)</h2>
		<div class="content">
			<ul>
				<li><a href="#">February</a> (7) </li>
				<li><a href="#">January 2007</a> (31)</li>
				<li><a href="#">December 2006</a> (31)</li>
				<li><a href="#">November 2006</a> (30)</li>
				<li><a href="#">October 2006</a> (31)</li>
				<li><a href="#">September 2006</a> (30)</li>
				<li><a href="#">August 2006</a> (31)</li>
				<li><a href="#">July 2006</a> (31)</li>
				<li><a href="#">June 2006</a> (30)</li>
				<li><a href="#">May 2006</a> (31)</li>

			</ul>
		</div>
	</div>

	<div id="pages" class="gbox">
		<h2 class="heading">Foros con más entradas</h2>
		<div class="content">
			<ul>
				<li><a href="#">My Blog</a></li>
				<li><a href="#">My Photos</a></li>
				<li><a href="#">My Favorites</a></li>
				<li><a href="#">About Me</a></li>
				<li><a href="#">Contact Me</a></li>
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
