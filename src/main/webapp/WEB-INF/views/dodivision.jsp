<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.formtable {
	width: 350px;
	border: 1px solid red;
	text-align: center;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<p>
	<table class=formtable>
		<c:forEach var="subject" items="${subject}">
			<td><c:out value="${subject.division}" /></td>
		</c:forEach>
		<tr>
			<c:forEach var="subject" items="${subject}">
				<td><c:out value="${subject.grade}" /></td>
			</c:forEach>
		</tr>
		</p>
	</table>

</body>
</html>