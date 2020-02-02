<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>S'inscrire</title>
<style type="text/css">
body {
    background-image: url("images/e1.jpg");
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: 100% 100%;
    
}
form {
    border: 3px solid #f1f1f1;
}
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}


.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
.titlecon{

padding: 16px;

}
.tik{
background-color:#f3f3f3;
opacity:0.8;
}
</style>
</head>
<body>
<div class="titlecon">

</div>
<div class="tik">
<form action="AddClient" method="post">
  <div class="container">
  <center><h2><b>S'enregistrer</b></h2></center>
    <label><b>Code</b></label>
    <input type="text" placeholder="Enter Code" name="code" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="mdp" required>

    <label><b>Nom</b></label>
    <input type="text" placeholder="Enter Le Nom" name="nom" required>
    
    <label><b>Adresse</b></label>
    <input type="text" placeholder="Enter L'Adresse" name="addresse" required>
    
    <label><b>Ville</b></label>
    <input type="text" placeholder="Enter La Ville" name="ville" required>
   
    <button type="submit">S'enregistrer</button>
    <button type=reset" >Effacer</button>
  </div>
  </div>
</form>
</body>
</html>