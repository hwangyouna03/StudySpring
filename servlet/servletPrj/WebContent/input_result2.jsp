<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 처리부분(controller) -->
<% 
String num = request.getParameter("num");
String model ="";
int num1 = Integer.parseInt(num);
if(num1%2==0)
	model1 = "짝수";
else model = "홀수";
%>

<!-- 출력부분view) -->
<% model %>입니다.
</body>
</html>