<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/carList.css">
</head>
<c:import url="/header" />
<body>
	<div class="content">
		<div class="title">
			<h2>차량검색</h2>
		</div>
		<div class="car">
			<c:forEach items="${carList }" var="car" varStatus="loop">
				<div>
					<a href=""><img alt="사진없음" src="${car.images[0] }"></a>
					<p>${car.name }</p>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
<c:import url="/footer" />
</html>