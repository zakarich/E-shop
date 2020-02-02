package com.gestion.business;

import java.util.List;
import java.util.Set;

import com.gestion.beans.articlebean;
import com.gestion.beans.client;
import com.gestion.beans.commandebean;

public interface Service {
	
	public boolean ajouterUsers(String code,String password, String name, String addresse,String ville);
	public client verification(String code,String psw);
	public List<articlebean> Affichearicle(); 
	public boolean ajoutecommande(commandebean cd,client clt);
	public List<commandebean>lister_commande(client clt);
}
