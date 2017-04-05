<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show</title>
</head>
<body>

<h1 align="center">Data Listing</h1>

<a href="new">Add</a>

		<table align="center" border="4">
		<tr bgcolor="gray">
		    <th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Country</th>
			<th>State</th>
			<th>JUGS</th>
			<th>Description</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="people">
			<tr>
				<td>${people._id}</td>
				<td>${people.name}</td>
				<td>${people.age}</td>
				<td>${people.address.country}</td>
				<td>${people.address.state}</td>
				<td>${people.jugs.get(0).name}</td>
				<td>
				<textarea rows="10" cols="60" name="description" disabled="disabled"> ${people.jugs.get(0).description} </textarea>
				</td>
				<td><a href="update/${people._id }">Edit</a></td>
				<td><a href="remove/${people._id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>      
</body>
</html>