<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<c:import url="/header" />
<body>
	<div class="content">
		<div class="adj">
			<img class="adjimage" src="/resources/image/adj_1.jpg">
		</div>
		<div class="car">
			<c:forEach items="${carList }" var="car" varStatus="loop">
				<div>
					<a href=""><img alt="사진없음" src="${car.images[0] }"></a>
					<p>${car.name }</p>
				</div>
			</c:forEach>
			<div>
				<input type="button" value="더보기">
			</div>
		</div>
	</div>
</body>
<c:import url="/footer" />
<script type="text/javascript" src="/resources/js/main.js"></script>
</html>