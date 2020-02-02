<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Bienvenue E-shop</title>

<style type="text/css">
body {
    background-image: url("images/e.jpg");
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: 100% 100%;
    
}

.button {
position:absolute;
top:450px;
left:205px;
  display: inline-block;
  border-radius: 4px;
  background-color: #4CAF50;
  border: none;
  
  color: #FFFFFF;
  text-align: center;
  font-size: 20px;
  padding: 15px;
  width: 150px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
.font{
font-family: Impact, Charcoal, sans-serif;
font-size:80px;
position:absolute;
top:250px;
left:205px;
opacity:0.8;
}
</style>
</head>
<body>
<div class="font">Welcome to<br><i class="fa fa-shopping-cart" style="font-size:50px;color:black;"></i> E-Shop Zaka</div>
<form action="get">
<button formaction ="index1.jsp" class="button" style="vertical-align:middle"><span>Buy Now </span>
</form>
</body>
</html>