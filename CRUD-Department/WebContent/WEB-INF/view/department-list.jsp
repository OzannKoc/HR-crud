<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEPARTMENTS</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>Departments</h1>

		</div>
	</div>
	<br>
	<div id="button-bar">
		<table width=100%>
			<tr>
				<c:forEach var="dept" items="${departments}">

				</c:forEach>
				<td width=80px><button onclick="window.location.href='add'"
						class="add-button">Add Department</button></td>


				<frm:form action="search" method="GET">
					<td><input type="text" name="DepartmentSearch"
						placeholder="DepartmentNameSearch" /></td>
					<td><select name="ManagerSearch">
							<option value=0>--- Select ---</option>
							<c:forEach var="dpt" items="${employees}">
								<option value="${dpt.id}">${dpt.firstName}
									${dpt.lastName}</option>
							</c:forEach>

					</select></td>
					<td><select name="LocationSearch">
							<option value=0 >--- Select ---</option>
							<c:forEach var="dpt" items="${locations}">
								<option value="${dpt.id}">${dpt.city}
									</option>
							</c:forEach>

					</select></td>
					<td width=80px><input type="submit" value="Search"
						class="search-button" /></td>
				</frm:form>
			</tr>
		</table>
	</div>
	<br>



	<table>
		<tr>
			<th>DEPARTMENT ID</th>
			<th>DEPARTMENT NAME</th>
			<th>MANAGER</th>
			<th>LOCATİON</th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach var="dept" items="${departments}">
			<tr>

				<td align="center">${dept.id}</td>
				<td align="center">${dept.name}</td>
				<td align="center">${dept.emp}</td>
				<td align="center">${dept.lct}</td>
				<c:url var="updateLink" value="/departments/update">
					<c:param name="deptId" value="${dept.id}" />
				</c:url>

				<c:url var="deleteLink" value="/departments/remove">
					<c:param name="deptId" value="${dept.id}" />
				</c:url>
				<td width=80px><button
						onclick="window.location.href='${updateLink}'"
						class="update-button">Update</button></td>
				<td width=80px><button
						onclick="if (confirm('Are you sure?'))window.location.href='${deleteLink}'"
						class="delete-button">Delete</button></td>

			</tr>
		</c:forEach>




	</table>
</body>
</html>