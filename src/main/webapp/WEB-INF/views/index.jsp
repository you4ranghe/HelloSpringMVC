<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>

    
    <jsp:include page="common/header.jsp">
    	<jsp:param name="title" value="jsp:param으로 설정된 값 넘어온 from index.jsp!!"/>
    </jsp:include>
    
		<section id="content">
			<img src="${path }/resources/images/spring.png" id="center-image" alt="스프링로고">
		</section>
		
	<jsp:include page="common/footer.jsp"/>
		
