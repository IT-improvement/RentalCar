<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/car.css">
</head>
<c:import url="/header" />
<body>
	<div class="content">
		<div class="left">
			<div class="image">
				<img src="/resources/image/CAR001_1.png">
			</div>
			<input type="button" class="reservation" value="예약하기">
		</div>
		<div class="right">
			<div class="info">
			<label>이름</label>
			<label>정보</label>
			<label>기름</label>
			<label>타입</label>
			</div>
		</div>
	</div>
</body>
<c:import url="/footer" />
</html>
