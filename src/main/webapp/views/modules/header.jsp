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
            <div class="Logo"><input type="button" value="����������" onclick="location.href='/carMainFormAction'"></div>
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
            <%
            if(user==null){
            %>
                <div><input type="button" value="�α���" onclick="location.href='/signIn'"></div>
            <%
            }else{
            %>
                <div><input type="button" value="�α׾ƿ�" onclick="location.href='/signInFormAction'"></div>
            <%} %>
            </div>
        </div>
        <div class="SecondMenu">
            <div><a href="">���� �˻�</a></div>
            <div><a href="">��Ʈ</a></div>
            <div><a href="/boardListFormAction">�Խ���</a></div>
            <div><a href="">��������</a></div>
        </div>
    </header>
</body>
</html>