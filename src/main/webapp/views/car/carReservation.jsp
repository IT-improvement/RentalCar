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
		<form action="/carFormAction" method="post">
			<input type="hidden" value="${carnumber }">
			<div class="left">
				<input type="text" name="start" />
				<input type="text" name="end" />
			</div>
			<div class="right">
				<div>
					<label>결재방식</label>
					<label class="pay">무통장입금</label>
				</div>
			</div>
			<input type="submit" value="예약하기">
		</form>
	</div>
</body>
<script type="text/javascript" src="/resources/js/carReservation.js"></script>
<c:import url="/footer" />
</html>