<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="style/style.css">
		<link rel="stylesheet" href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css">
		<script src="/webjars/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
		

	</head>
	<body>
		<h1>hola :)</h1>
 		<p>Your Gold: <c:out value="${gold}"></c:out> </p>
		<form method="POST" action="/Farm" >
  			<label for="POST-name">Farm:</label>
  			<button>Find Gold!</button>
		</form>

		<form method="POST" action="/Cave" >
  			<label for="POST-name">Cave</label>
  			<button>Find Gold!</button>
		</form>

		<form method="POST" action="/House" >
  			<label for="POST-name">House</label>
  			<button>Find Gold!</button>
		</form>

		<form method="POST" action="/Casino" >
  			<label for="POST-name">Casino!</label>
  			<button>Find Gold!</button>
		</form>
		
		<form method="POST" action="/Reset" >
  			<button >Reset</button>
		</form>
		<button class="btn btn-primary">Botón de Bootstrap</button>
		
		<h1>Activities</h1>
		<div class="actividades">
			<p> <c:out value="${mensaje}"></c:out>  </p>
			
		</div>
		

		
		
	</body>
</html>