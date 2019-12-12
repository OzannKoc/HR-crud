<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<frm:form>

</frm:form>
	<div id="wrapper">
		<div id="header">
			<h1>Departments</h1>
		</div>
	
		<h3>Registry</h3>

		<form action="save" method="POST">
			<input type="hidden" name="id" value="${id}" />
			<table>
				<tr>
					<td><label>Name Surname</label></td>
					<td><input type="text" name="name" value="${name}" required="required" minlength="2" /></td>
				</tr>
				<tr>
					<td><label>Managers</label></td>
					<td><select name="emp">
					
							<option value="${emp.id}">${emp}</option>
							<option value=0>--- Select ---</option>
							<c:forEach var="dpt" items="${employees}">
								<option value="${dpt.id}">${dpt.firstName}
									${dpt.lastName}</option>
							</c:forEach>

					</select></td>

				</tr>
				<tr>
					<td><label>Locations</label></td>
					<td><select name="lct">
					
							<option value="${lct.id}">${lct}</option>
							<option value=0>--- Select ---</option>
							<c:forEach var="dpt" items="${locations}">
								<option value="${dpt.id}">${dpt.city}</option>
							</c:forEach>

					</select>
				</tr>



				<tr>
					<td></td>
					<td><input type="submit" value="Save" class="save-button"></td>
				</tr>
			</table>
		</form>



		<div id="content">
			<button
				onclick="window.location.href='${pageContext.request.contextPath}/departments/list'"
				class="back-button">Back</button>
		</div>
</body>
</html>