<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
String num = request.getParameter("num");
int num1 = Integer.parseInt(num);
if(num1%2==0){%>
	짝수입니다.
<%	}else{  %>
		홀수입니다.
	<% }%>

</body>
</html>