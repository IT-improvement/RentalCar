<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/signIn.css">
</head>
<c:import url="/header" />
<body>
	<div class="content">
		<form action="/signInFormAction" method="post">
			<div class="Group33">
				<div>
					아이디<input type="text" name="id">
				</div>
			</div>
			<div class="Group36">
				<div>
					비밀번호<input type="password" name="password">
				</div>
			</div>
			<input type="submit" value="로그인">
		</form>
	</div>
</body>
<c:import url="/footer" />
</html>