<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Planets</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<link href="/styles.css" rel="stylesheet" />
<body>
<h1>List of Inner Planets</h1>
		<table class="table">
			<thead>
				<tr>
					<th rowspan="2">Name</th>
					<th rowspan="2">Colors</th>
					<th colspan="3">Distance From Sun (in millions of miles)</th>
					</tr>
					<tr>
						<th>Avg</th>
						<th>Min</th>
						<th>Max</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="planet" items="${planets}">
					<tr>
						<td><c:out value="${planet.name}" /></td>
						<td><ul>
						<c:forEach var="color" items="${planet.colors}">
						<li><c:out value="${color}" /></li>
						</c:forEach>
						</ul></td>
						<td><c:out value="${planet.million_miles_from_sun.average}" /></td>
						<td><c:out value="${planet.million_miles_from_sun.min}" /></td>
						<td><c:out value="${planet.million_miles_from_sun.max}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>