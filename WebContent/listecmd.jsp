<% %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="com.gestion.beans.commandebean"%> 
<%@page import="com.gestion.beans.client"%> 
<% List<commandebean> cmds=(List<commandebean>)request.getAttribute("listcmd");
request.setAttribute("cmds", cmds); %>
<% client clt=(client)request.getSession().getAttribute("client"); %>
<!DOCTYPE html>
<html>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    margin:10px;
}

li a:hover {
    background-color: #111;
}
.wlc{
margin-top:100px;
}
table, td, th {    
    border: 1px solid #ddd;
    text-align: center;
}

table {
    border-collapse: collapse;
    width: 100%;

}

th, td {
    padding: 10px;
}
th{
background:#f0f0f0;
}
button{
    background-color: #4CAF50;
    color: white;
    padding: 10px 16px;
    margin: 8px 5px;
    border: none;
    cursor: pointer;
    border-radius:8px;
    box-shadow: 0 9px #999;
}
input{
    background-color: #4CAF50;
    color: white;
    padding: 5px 10px;
    margin: 8px 5px;
    border: none;
    cursor: pointer;
    border-radius:8px;
}
button:hover {background-color: #3e8e41}
.material-icons.md-48 { font-size: 48px; }
button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
input[type=text]{
background-color:#fff;
color:black;
font-size:25px;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Interface CLIENT</title>
</head>
<body>
<div>
<h2>Utilisateur : <%=clt.getNom() %></h2>
</div>
<ul>
  <li><a href="interface_client.jsp">Home</a></li>
  <li><a href="#">Mes Commandes</a></li>
  <li><a href="article">Articles</a></li>
  <li><a href="#about">Mon panier</a></li>
  <li><a href="deconnecter">Déconnecter</a></li>
</ul>
<div class="wlc">
<center><h1><i class="material-icons md-48"> shop </i>    La Liste de mes commandes</h1></center></div>
</div>
<form action="#" method="get">
<table>      
<tr>       
 <th>Réference commande</th>        
 <th>Date commande</th>        
 <th>Montant HT</th> 
   <th>Action</th>    
 </tr>     
 <c:forEach var="user" items="${cmds}">       
 <tr>        
  <td>${user.ref}</td>       
  <td>${user.date}</td>        
  <td>${user.somme}</td>
  <td><button type="submit">Modifier</button></td>       
  </tr>    
   </c:forEach>   
     </table> 
     </form>
</body>
</html>