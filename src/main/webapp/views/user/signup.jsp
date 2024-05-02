<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/signup.css">
</head>
<c:import url="/header"/>
<body>
	<form action="/signUpFormAction" method="post">
		<div class="Group-Id">
			<div>
				아이디<input type="text" name="id">
			</div>
		</div>
		<div class="Group-Password">
			<div>
				비밀번호<input type="password" name="password">
			</div>
		</div>
		<div class="Group-PasswordCheck">
			<div>
				비밀번호 확인<input type="password" name="passwordCheck">
			</div>
		</div>
		<div class="Group-Name">
			<div>
				이름<input type="text" name="name">
			</div>
		</div>
		<div class="Group-phonenumber">
			<div>
				핸드폰번호<input type="text" name="phonenumber">
			</div>
		</div>
		<div class="Group-birthday">
			<div>
				주빈번호<input type="text" name="birthday">-<input type="text"
					name="gender">
			</div>
		</div>
		<div class="Group-email">
			<div>
				이메일<input type="text" name="email">
			</div>
		</div>
		<div class="Group-submit">
			<div>
				<input type="submit" value="회원가입">
			</div>
		</div>
	</form>
</body>
<c:import url="/footer"/>
</html>