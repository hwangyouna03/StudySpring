<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/login.css"/>
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/login" id="login-form">
         <label class="legend">아이디</label>

                  <input name="id" type="text">



                  <label class="legend">패스워드</label> 

                  <input name="pw" type="password"> 



                 <button type="submit">Login</button>
    </form>
</body>
</html>