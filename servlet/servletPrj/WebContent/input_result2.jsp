<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ó���κ�(controller) -->
<% 
String num = request.getParameter("num");
String model ="";
int num1 = Integer.parseInt(num);
if(num1%2==0)
	model1 = "¦��";
else model = "Ȧ��";
%>

<!-- ��ºκ�view) -->
<% model %>�Դϴ�.
</body>
</html>