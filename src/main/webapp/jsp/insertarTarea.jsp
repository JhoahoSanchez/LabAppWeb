<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Insertar Tarea</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body class="container-fluid p-0">
	<header class="row p-0 bg-black">
		<div class="col header-div justify-content-center">
			<h4 class="d-inline-flex header-text h-100 align-items-center"
				style="margin-left: 30px">SISTEMA DE GESTION DE TAREAS</h4>
		</div>
		<div class="col">
			<ul class="list-group list-group-horizontal float-end header-text"
				style="margin-right: 20px">
				<li class="list-group-item bg-black header-text list">Inicio</li>
				<li class="list-group-item bg-black header-text list">Cerrar
					Sesion</li>
			</ul>
		</div>
	</header>
	<main class="row">
		<section class="col">
			<div class="card card-it mx-auto text-center" style="top: 30px">
				<h1 class="card-header">Insertar Tarea</h1>
				<h3 class="card-subtitle">Ingrese la informacion de la tarea</h3>
				<form action="../InsertarTareaController" method="POST"
					class="card-body">
					<p class="h5 text-start">Codigo</p>
					<input type="text" name="txtCodigo" id="txtCodigo"
						class="input-group-text w-100 text-start" /> <br />
					<p class="h5 text-start">Nombre</p>
					<input type="text" name="txtNombre" id="txtNombre"
						class="input-group-text w-100 text-start" /><br /> <input
						type="submit" value="Insertar" class="btn btn-submmit text-center" />
				</form>
			</div>
		</section>
	</main>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>
