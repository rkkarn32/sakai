<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<br>
	<br>
	<br>


	<div class="panel panel-primary">
		<div class="panel-heading">Students in the Selected Section</div>
		<div class="panel-body">
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Student ID</td>
						<td>Roll NUm</td>
						<td>Name</td>
						<td>Advisor Name</td>
						<td>Number of section enrolled</td>

						<%-- 		<td><a href="books/${book.id}">edit</a></td> --%>
					</tr>
				</thead>

				<c:forEach var="student" items="${studentList}">
					<tbody>
						<tr>
							<td>${student.id}</td>
							<td>${student.rollNum}</td>
							<td>${student.name}</td>
							<td>${student.advisor.name}</td>
							<td>${fn:length(student.sections)}</td>

							<%-- 		<td><a href="books/${book.id}">edit</a></td> --%>
						</tr>
					</tbody>
				</c:forEach>
			</table>

		</div>
	</div>



	<div class="panel panel-primary">
		<div class="panel-heading">Assignment List</div>
		<div class="panel-body">
			<table class="table table-hover">
				<thead>
					<tr>
						<td>ID</td>
						<td>Title</td>
						<td>Details</td>
						<td>Open Date</td>
						<td>Due Date</td>
						<td>Grade Point</td>
						<td>View Assignment</td>

					</tr>
				</thead>

				<c:forEach var="assignment" items="${assignmentList }">
					<tbody>
						<tr>
							<td>${assignment.id }</td>
							<td>${assignment.title }</td>
							<td>${assignment.details }</td>
							<td>${assignment.openDate }</td>
							<td>${assignment.dueDate }</td>
							<td>${assignment.gradePoint }</td>
							<td><a href="<c:url value="/faculty/assignment/${assignment.id}"/>">Assignment</a></td>



						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>

	<div align="center">
		<a href="../createAssignment/${sectionId}">
			<button type="button" class="btn btn-primary">Create
				Assignment</button>
		</a>
	</div>
</body>
</body>
</html>