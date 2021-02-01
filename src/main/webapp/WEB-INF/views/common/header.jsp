<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- https://www.w3schools.com/bootstrap4/bootstrap_get_started.asp 에서 가져온
bootstrap4 > get start > CDN 방식으로 가져오기 (Content Delivery Network) -->

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<title>나의 첫 스프링 페이지</title>
</head>
<body>
	<div id="container">
		<header>
			<div id ="header-container">
				<h2><c:out value="${param.title }"></c:out></h2>
			</div>
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<a class="navbar-brand" href="#">
					<img src="${pageContext.request.contextPath }/resources/images/spring.png" alt="스프링로고"
					width="50px">
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
				aria-controls="navbarNav" aria-expended="flase" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active">
							<a class="nav-link" href="${path }">Home</a>
						</li>
						<!-- 추가메뉴 구성하기 -->
						<li class="nav-item active">
							<a class="nav-link" href="${path }/demo/demoHome.do">demo</a>
						</li>
						
					</ul>
				
				</div>
			</nav>
		</header>
	</div>