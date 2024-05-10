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
            <div class="Logo"><input type="button" value="메인페이지" onclick="location.href='/carMainFormAction'"></div>
            <div class="Group1">
            <%
            Object user = session.getAttribute("user");
            if(user==null){
            %>
                <div><input type="button" value="회원가입" onclick="location.href='/signUp'"></div>
                <%
            }else{
            	%>
                <div><input type="button" value="마이페이지" onclick="location.href='/'"></div>
			<%            	
            }
                %>
            </div>
            <div class="Group2">
            <%
            if(user==null){
            %>
                <div><input type="button" value="로그인" onclick="location.href='/signIn'"></div>
            <%
            }else{
            %>
                <div><input type="button" value="로그아웃" onclick="location.href='/signInFormAction'"></div>
            <%} %>
            </div>
        </div>
        <div class="SecondMenu">
            <div><a href="">차량 검색</a></div>
            <div><a href="">렌트</a></div>
            <div><a href="/boardListFormAction">게시판</a></div>
            <div><a href="">공지사항</a></div>
        </div>
    </header>
</body>
</html>