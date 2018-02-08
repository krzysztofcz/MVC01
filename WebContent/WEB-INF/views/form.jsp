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
	
	<form action="" method="POST">
	    <fieldset>
			<c:forEach begin="0" end="4" var="i" step="1">
		        <label>Title ${i}: <input type="text" name="title${i}"></label>
		        <label>Author ${i}: <input type="text" name="author${i}"></label>
		        <br>
		        <label>ISBN ${i}: <input type="text" name="isbn${i}"></label>
		        <hr>
			</c:forEach>
	        <input type="submit" value="Submit">
	    </fieldset>
	</form>
	
</body>
</html>