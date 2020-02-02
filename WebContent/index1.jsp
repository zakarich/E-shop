
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style1.css" > 
<title>Authentification</title>
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
opacity:0.9;
}
</style>
</head>
<body>
<div class="titlecon">

</div>
<div class="tik">
<form method="get">
  <div class="container">
  <center><h2><b>interface d'Authentification</b></h2></center>
    <label><b>Code</b></label>
    <input type="text" placeholder="Enter Code" name="code">

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="mdp">

    <button type="submit" formaction ="authentification">Valider</button>
    <button type="submit" formaction ="formulaire.jsp">S'enregistrer</button>
    <label>
      <input type="checkbox"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
  </div>
</form>
</body>
</html>