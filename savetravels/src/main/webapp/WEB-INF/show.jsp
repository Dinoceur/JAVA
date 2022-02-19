<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Save Travels</title>
</head>
<body>
	<div class="container border border-warning border-3 m-5 p-5">
		<h2 class="mb-5">Expense Detail</h2>
			<div class= "mb-3 column">
                 <div class= "row">Expense:<c:out value="${expense.name}" /></div>
                 <div class= "row">Vendor:<c:out value="${expense.vendor}" /></div>
                 <div class= "row">Amount:<c:out value="${expense.amount}" /></div>
                 <div class= "row">Actions:<c:out value="${expense.description}" /></div>
            </div>
            <a href="/" class="link-warning">Go Back</a>
     </div>

</body>
</html>