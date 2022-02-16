<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Fruity Loops</title>
</head>
<body>
	<div class = "m-5 p-5 border border-warning border-3">
		<h2>Fruit Store</h2>
		<table class="table table-info table-hover border border-info">
			<tr>
				<th>Fruits</th>
				<th>Price</th>
			</tr>
			<c:forEach var="fruits" items="${ fruitsList }">
				<tr>
					<td>
						<c:out value="${ fruits.name }"> </c:out>
					</td>
					<td>
						<c:out value="${ fruits.price }"> </c:out>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>