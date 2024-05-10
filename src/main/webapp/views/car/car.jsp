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
				<img alt="사진없음" src="${car.images[0] }">
			</div>
			<input type="button" class="reservation" value="예약하기" onclick="location.href='/carReservation?carnumber=${car.carnumber}&price=${car.price }'">
		</div>
		<div class="right">
			<div class="info">
			<label>이름</label><p>${car.name }</p>
			<label>타입</label><p>${car.type }</p>
			<label>기름</label><p>${car.oil }</p>
			<label>정보</label><p>${car.info }</p>
			<label>하루가격</label><p>${car.price }</p>
			</div>
		</div>
	</div>
</body>
<c:import url="/footer" />
</html>
