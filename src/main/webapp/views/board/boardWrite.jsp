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
	<c:choose>
	<c:when test="${empty board }">
	<form action="/boardListFormAction" method="post">
		<span>제목</span><input type="text" name="title"><br>
		<span>내용</span><br>
		<textarea name="content" class="content"></textarea>
		<input type="submit" value="작성하기">
	</form>
	</c:when>
		<c:when test="${not empty board }">
		<form action="/boardUpdateFormAction" method="post">
		<input type="hidden" name="index" value="${board.boardIndex }">
		<input type="hidden" name="id" value="${user.id }">
		<span>제목</span><input type="text" value="${board.title }" name="title"><br>
		<span>내용</span><br>
		<textarea name="content" class="content" placeholder="${board.content }" cols="50" rows="10">${board.content }
		</textarea>
		<input type="submit" value="작성하기">
	</form>
		</c:when>
	</c:choose>
	</div>
</body>
<c:import url="/footer" />
</html>