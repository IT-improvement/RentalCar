<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/boardWrite.css">

</head>
<c:import url="/header" />
<body>
	<div class="box">
		<span>제목</span>${board.title }<br>
		<span>작성자</span>${board.id }<br>
		<span>작성시간</span>${board.date }<br>
		<span>내용</span>${board.content }<br>
	</div>
</body>
<c:import url="/footer" />
</html>