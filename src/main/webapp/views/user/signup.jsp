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
            <div>���̵�<input type="text" name="id"></div>
        </div>
        <div class="Group36">
            <div>��й�ȣ<input type="password" name="password"></div>
        </div>
        <div class="Group37">
            <div>��й�ȣ Ȯ��<input type="password" name="passwordCheck"></div>
        </div>
        <div class="Group38">
            <div>�̸�<input type="text" name="name"></div>
        </div>
        <div class="Group39">
            <div>�ڵ�����ȣ<input type="text" name="phonenumber"></div>
        </div>
        <div class="Group40">
            <div>�ֺ��ȣ<input type="text" name="birthday">-<input type="text" name="gender"></div>
        </div>
        <div class="Group41">
            <div>�̸���<input type="text" name="email"></div>
        </div>
        <div class="Group35">
            <div><input type="submit" value="ȸ������"></div>
        </div>
</form>
</body>
<c:import url="/footer"/>
</html>