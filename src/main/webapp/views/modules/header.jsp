<%@page import="service.user.model.UserResponseDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/nav.css">
</head>
<body>
<header>
        <div class="FirstMenu">
            <div class="Logo"></div>
            <div class="Group1">
            <%
            Object user = session.getAttribute("user");
            if(user==null){
            %>
                <div><input type="button" value="ȸ������" onclick="location.href='/signUp'"></div>
                <%
            }else{
            	%>
                <div><input type="button" value="����������" onclick="location.href='/'"></div>
			<%            	
            }
                %>
            </div>
            <div class="Group2">
                <div><input type="button" value="�α���" onclick="location.href='/signIn'"></div>
            </div>
        </div>
        <div class="SecondMenu">
            <div>���� �˻�</div>
            <div>��Ʈ</div>
            <div>�Խ���</div>
            <div>��������</div>
        </div>
    </header>
</body>
</html>