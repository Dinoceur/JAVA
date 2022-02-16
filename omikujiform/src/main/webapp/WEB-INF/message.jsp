<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class = "card m-5 p-5 border border-warning border-3">
		<h2>Here's Your Omikuji</h2>
		<div class="card m-5 p-5 bg-warning">
			<p>In ${ number } years, you will live in ${ city } with ${ name }
			as your roommate, ${ hobby } for a living. The next time you see a ${ living },
			you will have good luck. Also, ${ message }.</p>
		</div>
		<a class="btn btn-outline-secondary" href="/">Go Back.</a>
	</div>
</body>
</html>