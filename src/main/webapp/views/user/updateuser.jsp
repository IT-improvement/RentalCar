<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<link rel="stylesheet" href="/resources/css/updateuser.css">
</head>
<c:import url="/header" />
<body>
    <div class="container">
        <h1>회원정보 수정</h1>
        <form action="/updateUserAction" method="post">
                <label for="username">이름: ${sessionScope.user.id }</label>
                <label for="email">이메일:</label>
                <input type="text" id="email" name="email" value="${sessionScope.user.email }">
                <label for="password">비밀번호:</label>
                <input type="password" id="password" name="password" required>
                <label for="confirmPassword">비밀번호 확인:</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
                <div class="separator">
                <label for="name">이름:</label>
                <input type="text" id="name" name="name" value="${sessionScope.user.name }" maxlength="4">
                </div>
                <div class="separator">
                <label for="email">핸드폰번호:</label>
                <input type="text" id="phonenumber" name="phonenumber" value="${sessionScope.user.phonenumber }">
				</div>
				<div class="separator">
                <label for="birthday">주민번호:</label>
				    <input type="text" id="birthday" name="birthday" maxlength="6" value="${sessionScope.user.birthday }">
				    <label for="dash">-</label>
				    <input type="text" id="gender" name="gender" maxlength="1">
				    <label >XXXXXX</label>
				</div>
            <button type="submit">수정 완료</button>
        </form>
    </div>
</body>
<c:import url="/footer" />
</html>
