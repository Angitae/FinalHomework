<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.formtable {
	width: 200px;
	border: 1px solid red;
	text-align: center;
}
</style>
<title>Insert title here</title>
</head>
<body>


	<form method="get"
		action="${pageContext.request.contextPath}/doregister"  accept-charset="UTF-8" >

		<table class="formtable">
			<tr>
				<td>SubjectName:</td>
				<td><input name="esubjectname" type="text" /></td>
			<tr>
				<td>SubjectCode:</td>
				<td><input name="esubjectcode" type="text" /></td>
			<tr>
				<td>Grade:</td>
				<td><input name="egrade" type="text" /></td>
			<tr>
				<td>Division:</td>
				<td><input name="edivision" type="text" /></td>
			<tr>
				<td></td>
				<td><input value="Create Subject" type="submit" /></td>
		</table>
	</form>
</body>
</html>