<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.formtable {
	width: 400px;
	border: 1px solid blue;
	text-align: center;
}
</style>
<title>Register</title>
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
				<td>Credit:</td>
				<td><input name="ecredit" type="text" /></td>
			<tr>
				<td>Section:</td>
				<td><input name="esection" type="text" /></td>
			<tr>
				<td></td>
				<td><input value="Create Subject" type="submit" /></td>
		</table>
	</form>
</body>
</html>