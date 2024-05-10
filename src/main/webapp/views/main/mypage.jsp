<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/mypage.css">
</head>
<c:import url="/header" />
<body>
	<div class="container">
		<div class="Sidebar">
			<div class="info">
				<div class="username">주승재 고객님</div>
				<div class="greeting">반갑습니다.</div>
			</div>
			<div class="click-user">회원정보 수정</div>
			<div class="click-reservation">렌트 예약 내역</div>
			<div class="click-cancel">렌트 취소 내역</div>
		</div>
		<div class="latest-content">
			<div class="latest-reservation">
				<p>최신 렌트 예약 내역</p>
				<div></div>
			</div>
			<div class="latest-cancellation">
				<p>최신 렌트 취소 내역</p>
				<div></div>
			</div>
		</div>
	</div>
</body>
<c:import url="/footer" />
</html>
