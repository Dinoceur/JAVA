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
	<div class="container m-5 p-5">
            <h2 class="m-5">Save Travels</h2>
            <table class="table table-secondary table-striped border border-warning border-3 m-5">
              <thead>
                <tr>
                  <th scope="col">Expense</th>
                  <th scope="col">Vendor</th>
                  <th scope="col">Amount</th>
                  <th scope="col" class="text-center">Actions</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="expense" items="${expenses}">
                  <tr>
                    <td>
                      <a href="/expenses/${expense.id}" class="link-dark">
                        <c:out value="${expense.name}" />
                      </a>
                    </td>
                    <td>
                      <c:out value="${expense.vendor}" />
                    </td>
                    <td>
                      $
                      <c:out value="${expense.amount}" />
                    </td>
                    <td class="d-flex align-items-center justify-content-evenly">
                      <a href="/expenses/${expense.id}/edit" class="link-warning">Edit</a>
                      <form action="/expenses/${expense.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input type="submit" value="Delete" class="btn btn-outline-secondary">
                      </form>
                    </td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
            <div class="row">
              <h4 class="m-5">Add an expense:</h4>
              <div class="card border border-warning border-3 m-5 p-5">
                <form:form action="/expenses/new" method="POST" modelAttribute="expense">
                  <div class="mb-4">
                    <form:label path="name" for="formInput" class="form-label">Expense Name:</form:label>
                    <form:input type="text" class="form-control" id="formInput" path="name" />
                    <form:errors path="name" class="text-danger" />
                  </div>
                  <div class="mb-4">
                    <form:label path="vendor" for="formInput" class="form-label">Vendor:
                    </form:label>
                    <form:input type="text" class="form-control" id="formInput" path="vendor" placeholder="" />
                    <form:errors path="vendor" class="text-danger" />
                  </div>
                  <div class="mb-4">
                    <form:label path="amount" for="formInput" class="form-label">Amount:
                    </form:label>
                    <form:input type="amount" class="form-control" id="formInput" path="amount" placeholder="" />
                    <form:errors path="amount" class="text-danger" />
                  </div>
                  <div class="mb-4">
                    <form:label path="description" for="formControlTextarea" class="form-label">
                      Description:</form:label>
                    <form:textarea path="description" class="form-control" id="formControlTextarea" rows="3" />
                    <form:errors path="description" class="text-danger" />
                  </div>
                  <div class="d-flex justify-content-end">
                    <input type="submit" value="Submit" class="btn btn-outline-secondary">
                  </div>
                </form:form>
              </div>
            </div>
          </div>
</body>
</html>