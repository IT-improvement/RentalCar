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
<c:import url="/header" />
<body>
	<form action="/signUpFormAction" method="post">
		<div class="content">
			<div class="Group-Id">
				<div>
					<input type="text" name="id" placeholder="���̵�">
				</div>
			</div>
			<div class="Group-Password">
				<div>
					<input type="password" name="password" placeholder="��й�ȣ">
				</div>
			</div>
			<div class="Group-PasswordCheck">
				<div>
					<input type="password" name="passwordCheck" placeholder="��й�ȣȮ��">
				</div>
			</div>
			<div class="Group-Name">
				<div>
					<input type="text" name="name" placeholder="�̸�">
				</div>
			</div>
			<div class="Group-phonenumber">
				<div>
					<input type="text" name="phonenumber" placeholder="�ڵ�����ȣ(000-0000-0000)">
				</div>
			</div>
			<div class="Group-birthday">
				<div>
					�ֺ��ȣ<br>
					<input type="text" class="number" name="birthday">
					-<input type="text" class="number" name="gender">
				</div>
			</div>
			<div class="Group-email">
				<div>
					�̸���<input type="text" name="email">
				</div>
			</div>
			<div class="Group-submit">
				<div>
					<input type="submit" value="ȸ������">
				</div>
			</div>
		</div>
	</form>
</body>
<c:import url="/footer" />
</html>