<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>


<p>	<a href="${pageContext.request.contextPath}/dosemester">학기별 이수학점 조회</a><br/>
<p>	<a href="${pageContext.request.contextPath}/dosection">이수 구분별 학점 조회</a><br/>
<p>	<a href="${pageContext.request.contextPath}/register">수강신청 하기</a><br/>
<p>	<a href="${pageContext.request.contextPath}/doregisterview">수강신청 조회</a>
</body>
</html>
