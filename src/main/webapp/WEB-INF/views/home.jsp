<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>View</title>
</head>
<body>
	<div class="container mt-3">
		<div class="mx-auto pt-3" style="width: 200px;">
			<h1>TODO</h1>
		</div>
		<div class="row mt-5">
			<div class="col-md-2">
				<div class="list-group">
					<button type="button"
						class="list-group-item list-group-item-action active">
						Menu</button>
					<a href='<c:url value='/add'></c:url>'
						class="list-group-item list-group-item-action">Add</a> <a
						href='<c:url value='/home'></c:url>'
						class="list-group-item list-group-item-action">View</a>
				</div>
			</div>
			<div class="col-md-10">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">TODO Title</th>
							<th scope="col">TODO Content</th>
							<th scope="col">Delete</th>
							<th scope="col">Edit</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="todo" items="${list}">
							<tr>
								<td>${todo.id}</td>
								<td>${todo.todoTitle}</td>
								<td>${todo.todoContent}</td>
								<td><button type="button" class="btn btn-light"><a href="home/${todo.id}">Delete</a></button></td>
								<td><button type="button" class="btn btn-light"><a href="edit">Update</a></button></td>

								<%-- 
							<td><a href="deleteemp/${todo.id}">Delete</a></td>
							
				<td><a href="editemp/${emp.id}">Edit</a></td>
				<td><a href="deleteemp/${emp.id}">Delete</a></td>
				
				--%>


							</tr>
						</c:forEach>

					</tbody>
				</table>

				
			</div>

		</div>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>