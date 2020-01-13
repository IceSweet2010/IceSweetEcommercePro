<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	ni hao xiao yu~

	<form name="form" method="post"
		action="${pageContext.request.contextPath}/inputmywords"
		accept-charset="utf-8">
		<input type="type" name="myword" value="admin"> <input
			type="submit" value="提交" />
		</from>
</body>
</html>