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
<title>Create Ninja Form</title>
</head>
<body>
	<div class="container border border-warning border-3 m-5 p-5">
	<h3 class="m-5">New Ninja</h3>
		<form:form action="/ninjas/create" method="POST" modelAttribute="ninja">
                <div class="m-5">
                  <form:label path="dojo" for="formInput" class="form-label">Dojos</form:label>
                  <form:select path = "dojo">
                    <c:forEach var = "dojo" items="${dojos}">
                      <form:option value="${dojo.id}" path="dojo">
                        <c:out value = "${dojo.name}"/>
                      </form:option>
                    </c:forEach>
                  </form:select>
                </div>
                <div class="m-5">
                  <form:label path="firstName" for="formInput" class="form-label">First Name
                  </form:label>
                  <form:input type="text" class="form-control" id="formInput" path="firstName" />
                  <form:errors path="firstName" class="text-danger" />
                </div>
                <div class="m-5">
                  <form:label path="lastName" for="formInput" class="form-label">Last Name
                  </form:label>
                  <form:input type="text" class="form-control" id="formInput" path="lastName" placeholder="" />
                  <form:errors path="lastName" class="text-danger" />
                </div>
                <div class="m-5">
                  <form:label path="age" for="formInput" class="form-label">Age
                  </form:label>
                  <form:input type="number" class="form-control" id="formInput" path="age" placeholder="" />
                  <form:errors path="age" class="text-danger" />
                </div>
                <div class="d-flex justify-content-end">
                  <input type="submit" value="Create" class="btn submit-btn">
                </div>
              </form:form>
	</div>
</body>
</html>