<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your ToDo List</title>
</head>
<body>
<h2><b>Todo List</b></h2>
<c:if test="${fn:length(items.items) == 0 }">
	<p>You have nothing to do. </p>
</c:if>

<form action="Add" method="post">
	<table border="1">
		<tr>
			<th>Item</th><th>Date</th><th>Done</th>
		</tr>
		<c:forEach items="${items.items }" var="item" varStatus="status">
			<tr>
				<c:choose>
					<c:when test="${item.complete }">
						<td><strike>${item.task }</strike></td>
						<td><strike>${item.date }</strike></td>
						<td></td>
					</c:when>
					<c:otherwise>
						<td>${item.task }</td>
						<td>${item.date }</td>
						<td align="center"><a href="Delete?task=${item.task}&date=${item.date}">X</a></td>
					</c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>
		<tr>
			<td><input type="text" name="item"/></td><td colspan="2" align="center"><input type="submit" name="add" value="Add"/></td>
		</tr>
	</table>
</form>

</body>
</html>