<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
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
<title>Create Dojo Form</title>
</head>
<body>
	<div class="container border border-warning border-3 m-5 p-5">
		<h3>New Dojo</h3>
        <div class="card m-5 p-5">
            <form:form action="/dojos/create" method="POST" modelAttribute="dojo">
              <div class="m-5">
                 <form:label path="name" for="formInput" class="form-label">Dojo Name</form:label>
                 <form:input type="text" class="form-control" id="formInput" path="name" />
                 <form:errors path="name" class="text-danger" />
              </div>
              <div class="d-flex justify-content-end">
                 <input type="submit" value="Create" class="btn submit-btn">
              </div>
            </form:form>
          </div>
	</div>
</body>
</html>