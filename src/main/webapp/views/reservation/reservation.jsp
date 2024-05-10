<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/carReservation.css">
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
<script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
</head>
<c:import url="/header" />
<body>
	<div class="content">
		<form action="/reservationFormAction" method="post">
			<input type="hidden" value="${param.carnumber }" name="carnumber">
			<input type="hidden" value="${param.price }" name="price">
			<div class="left">
			    <input type="text" name="start" />
			    <input type="text" name="end" />
			    <div class="error-message"></div>
			</div>
			<div class="right">
				<div>
					<span class="title">결재방식</span>
					<div class="radio-button">
						<input type="radio" id="non" name="pay" value="non" checked>
						<input type="radio" id="card" name="pay" value="card">
						<label id="pay-non" for="non">
							<div><span>무통장입금</span></div>
						</label>
						<label id="pay-card" for="card">
							<div><span>카드결제</span></div>
						</label>
					</div>
					<span class="title">하루 가격</span>
					<label class="price">${param.price }</label>
				</div>
			</div>
			<input type="submit" value="예약하기">
		</form>
	</div>
</body>
<script type="text/javascript" src="/resources/js/carReservation.js"></script>
<c:import url="/footer" />
</html>