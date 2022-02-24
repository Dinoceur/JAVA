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
<title>Show All</title>
</head>
<body>
	<div class="container border border-warning border-3 m-5 p-5">
		<h3 class="m-5">${dojo.name} Location Ninjas</h3>
		<div class="container m-5 p-5">
              <table class="table table-dark mb-5">
                <thead>
                  <tr>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Age</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="ninja" items="${dojo.ninjas}">
                    <tr>
                      <td>
                          <c:out value="${ninja.firstName}" />
                      </td>
                      <td>
                        <c:out value="${ninja.lastName}" />
                      </td>
                      <td>
                        <c:out value="${ninja.age}" />
                      </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
          </div>
	</div>
</body>
</html>