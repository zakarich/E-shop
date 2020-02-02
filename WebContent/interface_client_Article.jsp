<%@ page import="com.gestion.beans.articlebean"%>
<%@ page import="com.gestion.beans.client"%>
<%@page import="java.util.ArrayList"%>
<% client clt=(client)request.getSession().getAttribute("client"); %>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<% List<articlebean> users=(List<articlebean>)request.getAttribute("users");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Interface CLIENT</title>
<script type="text/javascript">

function ajout(n){
    
	var table = document.getElementById("panier");
	var row0 = table.insertRow(0);
	var cell1 = row0.insertCell(0);
	var cell2 = row0.insertCell(1);
	var cell3 = row0.insertCell(2);
	cell3.id="tc";
	var td = document.getElementById(n); 
	var text=td.firstChild.nodeValue;
	
	if(text==0){
	
		var td = document.getElementById("tc");
		
		cell1.innerHTML = "Clé Usb 32 GO";
		cell2.innerHTML = "50 DH";
		 bouton = document.createElement("input");
		 bt = document.createElement("input");
		 bt.id="";
		 bt.type="button";
		 bt.value="Valider"
			 bt.onclick= function(){
			 var sm =document.getElementsByName("t")[0];
			 var x=parseInt(sm.value);
		      x+=50;
		      sm.setAttribute("value", x);
		      
		      
		    }; 
		 
		  bouton.id = "bouton0";
		  bouton.type = "button";
		  bouton.value = "Supprimer";
		  bouton.onclick= function(){
		      alert( this.id);
		    };  
		    td.appendChild(bt);
		td.appendChild(bouton);
	}
	if(text==1){
		var td = document.getElementById("tc");
		cell1.innerHTML = "Projecteur c15";
		cell2.innerHTML = "700 DH";
		bouton = document.createElement("input");
		bt = document.createElement("input");
		 bt.id="";
		 bt.type="button";
		 bt.value="Valider";
			 bt.onclick= function(){
				 var sm = document.getElementsByName("t")[0];
					var x=parseInt(sm.value);
		      x+=700;
		      sm.setAttribute("value", x);
		    }; 
		    
		  bouton.id = "bouton1";
		  bouton.type = "button";
		  bouton.value = "supprimer";
		  bouton.onclick= function(){
		      alert( this.id);
		    }; 
		    td.appendChild(bt);
		td.appendChild(bouton);
	}
	if(text==2){
		var z=0;
		var td = document.getElementById("tc");
		cell1.innerHTML = "Ellitbook hp";
		cell2.innerHTML = "350 DH";
		bouton = document.createElement("input");
		bt = document.createElement("input");
		 bt.id="";
		 bt.type="button";
		 bt.value="Valider"
			 bt.onclick= function(){
			 var sm =  document.getElementsByName("t")[0];
				var x=parseInt(sm.value);
		      x+=350;
		      sm.setAttribute("value", x);
		    }; 
		  bouton.id = "bouton2";
		  bouton.type = "button";
		  bouton.value = "supprimer";
		  bouton.onclick= function(){
		      alert( this.id);
		    };  
		    td.appendChild(bt);
		td.appendChild(bouton);
	}	
	
}


</script>
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
</head>
<body>

<div>
<h2>Utilisateur : <%=clt.getNom() %></h2>
</div>
<ul>
  <li><a href="interface_client.jsp">Home</a></li>
  <li><a href="Listcommande">Mes Commandes</a></li>
  <li><a href="#">Articles</a></li>
  <li><a href="#about">Mon panier</a></li>
  <li><a href="deconnecter">Déconnecter</a></li>
</ul>
<div class="wlc">
<center><h1><i class="fa fa-shopping-cart" style="font-size:48px;color:black;"></i>   Liste des Articles de la boutique</h1></center></div>
</div>

<table>      
<tr>        
<th>code</th>        
<th>désignation</th>        
<th>prix unitaire</th> 
<th>Quantité</th> 
</tr>        
  <c:forEach var="user" items="${users}">       
     <tr>        
  <td id="${user.code}">${user.code}</td>        
  <td>${user.desi}</td>      
  <td>${user.prix} DH</td> 
  <td><button  onclick="ajout(${user.code})">Ajouter au panier</button></a></td>     
     </tr>     
     </c:forEach>
</table> 

<center><h1><i class="material-icons md-48" style="font-size:30px;color:black;">add</i> Liste des Articles Ajouter</h1></center></div>
<table id="panier">
</table>
<form action="commande" method="get">

<h1>Le Montant HT: <input type="text" name="t"  value="0"/>DH</h1>

<button type="submit">Passer Commande</button>

</form>
</body>
</html>