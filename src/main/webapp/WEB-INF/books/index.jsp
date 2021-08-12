<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Here are your Books</h1>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number Of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneBook" items="${books}">
			<tr>
				<td><c:out value="${oneBook.title}"/></td>
				<td><c:out value="${oneBook.description}"/></td>
				<td><c:out value="${oneBook.language}"/></td>
				<td><c:out value="${oneBook.numberOfPages}"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/books/new">New Book</a>
	
	
</body>
</html>