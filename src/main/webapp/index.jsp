<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
body{
background-color:black;
margin:0px;
padding:0px;
font-size:25px;
}
body:hover{
background-image:url("img6.jpg");
background-repeat:repeat;
}
.div{
background-color:lightblue;
width:40%;
padding:6%;
text-align:center;
margin-left:25%;
margin-top:8%;
border-radius:18px;
opacity:1;
}
.div:hover{
background-color:yellow;
}
input[type="text"]{
border-radius:15px;
width:45%;
padding:2%;
text-align:center;
font-size:15px;
}
input[type="text"]:hover{
cursor:pointer;
width:60%;
}
input[type="password"]{
border-radius:15px;
width:45%;
padding:2%;
text-align:center;
font-size:15px;
}
input[type="password"]:hover{
cursor:pointer;
width:60%;
}
input[type="submit"]{
border-radius:15px;
width:45%;
padding:2%;
text-align:center;
font-size:15px;
}
input[type="submit"]:hover{
cursor:pointer;
background-color:red;
}
h1:hover{
text-decoration: underline;
}
</style>
</head>
<body>
<div class="div">
<h1>Login</h1>
<form action="Servlet1" method="post">
<lable for="name">Username</lable> &nbsp;&nbsp;
<input type="text" name="username" placeholder="Username" required/><br><br>
<lable for="password">Password</lable> &nbsp;&nbsp;
<input type="password" name="password" placeholder="Password" required/><br><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Login" /> 
</form>
</div>
</body>
</html>