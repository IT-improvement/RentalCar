<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/boardList.css">

</head>
<c:import url="/header" />
<body>
	<div class="content">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty boardList }">
					<tr>
					<td colspan="4">등록된 게시물이 없습니다^^*</td>
					</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${boardList }" var="board" varStatus="loop">
						<tr>
							<td>${ board.number }</td>
							<td><a href="">${ board.title }</a></td>
							<td>${ board.content }</td>
							<td>${ board.date }</td>
						</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
<c:import url="/footer" />
</html>