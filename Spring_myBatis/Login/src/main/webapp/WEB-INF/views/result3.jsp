<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach  var="val" items="${temp}">
<!-- temp 에 있는 값을 하나씩  자동으로 val 에 넣는다. -->
${val.id }, ${val.pw }
</c:forEach>

</body>
</html>