<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*"
    pageEncoding="utf-8"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>My jsp</title>
	</head>
		
	<body>
		<%
			session.setAttribute("user", "liujun");
		%>
		登录成功
	</body>
</html>