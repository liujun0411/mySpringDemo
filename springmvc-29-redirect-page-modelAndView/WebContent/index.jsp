<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*"
    pageEncoding="utf-8"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>My jsp</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath }/liujun/register.do" method="POST">
			姓名：<input type = "text" name="name"/> <br>
			年龄：<input type = "text" name="age"/> <br> 
			
			<input type= "submit" value="注册"/>
		</form>
	</body>
</html>