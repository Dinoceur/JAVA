<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class = "card m-5 p-5 border border-warning border-3">
		<h2>Send an Omikuji!</h2>
			<form action="/omikuji" class= "p-5 bg-warning" method="post">
				<label>Pick any number from 5 to 25:</label>
					<input type="number" name="number"><br>
				<label>Enter the name of any city:</label>
					<input type="text" name="city"><br>
				<label>Enter the name of any real person:</label>
					<input type="text" name="name"><br>
				<label>Enter professional endeavor or hobby:</label>
					<input type="text" name="hobby"><br>
				<label>Enter any type of living thing:</label>
					<input type="text" name="living"><br>
				<label>Say something nice to someone:</label>
					<textarea name="message"></textarea><br>
				<p class="fw-bolder text-decoration-underline">Send and show a friend</p>
				<input class="btn btn-outline-secondary" type="submit">
			</form>
		</div>
</body>
</html>