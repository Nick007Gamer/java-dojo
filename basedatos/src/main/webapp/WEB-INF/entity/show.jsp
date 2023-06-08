<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1><c:out value="${entity.name}"/></h1>
	<p>ID: <c:out value="${entity.id}"/></p>
	<p>REGION: <c:out value="${entity.region}"/></p>
	<p>CONTINENT: <c:out value="${entity.continent}"/></p>
	<a href="/books/${entity.id}/edit">Edit PAIS</a>
	<hr>
	<form action="/books/${entity.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>


</body>
</html>