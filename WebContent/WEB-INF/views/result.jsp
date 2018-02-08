<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${ksiazki.size()>0}">
		<c:forEach items="${ksiazki}" var="Book">
			<li>
			${Book.title}
			${Book.author}
			</li>
		</c:forEach>
	</c:if>
	<hr>
	<c:if test="${ileKsiazek==null}">
		${ksiazka.title}
		${ksiazka.author}
	</c:if>
</body>
</html>