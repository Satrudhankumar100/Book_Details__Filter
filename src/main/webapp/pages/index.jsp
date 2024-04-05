<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<body>
	<div class="container-fluid">
		<h2 class="bg-dark text-white mt-2 text-center">Book Details</h2>
	
		<form:form method="Post" modelAttribute="search" action="search">
			<table>
				<tr>
					<td>Course Name</td>
					<td><form:select path="courseName" class="form-control">
							<form:option value="">-SELECT-</form:option>
							<form:options items="${courseNames }"></form:options>

						</form:select></td>


					<td>Book Name</td>
					<td><form:select path="bookName" class="form-control">
							<form:option value="">-SELECT-</form:option>
							<form:options items="${bookNames }"></form:options>

						</form:select></td>


					<td>Book Price</td>
					<td><form:select path="bookPrice" class="form-control">
							<form:option value="">-SELECT-</form:option>
							<form:options items="${bookPrice }"></form:options>
	
						</form:select></td>
											<td><input type="submit" value="Search" class="btn btn-outline-primary"></td>
						
				
				</tr>
			</table>


			<hr />
			<table class="table table-hover table-bordered text-center">
				<thead class="bg-dark text-white">
					<tr>
						<td>S.No</td>
						<td>Course</td>
						<td>Book Name</td>
						<td>Book Price</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bookDetails }" var="bookDetails"
						varStatus="index">
						<tr>
							<td>${index.count}</td>
							<td>${bookDetails.courseName }</td>
							<td>${bookDetails.bookName }</td>
							<td>${bookDetails.bookPrice }</td>

						</tr>
			
					</c:forEach>
					<tr>
						<c:if test="${empty bookDetails }">
						
						<td colspan="4" class="text-center">No Record Found</td>
						</c:if>
					</tr>
				</tbody>
			</table>

			<hr />
		</form:form>
		
	
		
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>

</html>