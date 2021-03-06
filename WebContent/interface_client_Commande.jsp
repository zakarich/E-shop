     <%@page import="java.util.List"%>
     <%@page import="java.time.LocalDate"%>
     <%@ page import="com.gestion.beans.client"%>
    <% client clt=(client)request.getSession().getAttribute("client"); %>
    <%LocalDate date=(LocalDate)request.getAttribute("somme"); %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Interface CLIENT</title>
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
margin-top:200px;
}
input[type=text]:disabled {
    background: #fff;
    color:black;
    border:none;
    font:  bold 20px arial, sans-serif;
}
</style>
</head>
<body>
<div>
<h2>Utilisateur : <%=clt.getNom()%><%=date %></h2>
</div>
<ul>
  <li><a href="interface_client.jsp">Home</a></li>
  <li><a href="#">Mes Commandes</a></li>
  <li><a href="article">Articles</a></li>
  <li><a href="#about">Mon panier</a></li>
  <li><a href="deconnecter">Déconnecter</a></li>
</ul>

</body>
</html>