<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<div class="Group33">
            <div>아이디<input type="text" name="id"></div>
        </div>
        <div class="Group36">
            <div>비밀번호<input type="password" name="password"></div>
        </div>
        <div class="Group37">
            <div>비밀번호 확인<input type="password" name="passwordCheck"></div>
        </div>
        <div class="Group38">
            <div>이름<input type="text" name="name"></div>
        </div>
        <div class="Group39">
            <div>핸드폰번호<input type="text" name="phonenumber"></div>
        </div>
        <div class="Group40">
            <div>주빈번호<input type="text" name="birthday">-<input type="text" name="gender"></div>
        </div>
        <div class="Group41">
            <div>이메일<input type="text" name="email"></div>
        </div>
        <div class="Group35">
            <div><input type="submit" value="회원가입"></div>
        </div>
</form>
</body>
<c:import url="/footer"/>
</html>