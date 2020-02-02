package com.gestion.dao;

import java.util.List;
import java.util.Set;

import com.gestion.beans.articlebean;
import com.gestion.beans.client;
import com.gestion.beans.commandebean;

public interface UtilDao {
	
	public boolean addUser(String code,String password, String name, String addresse,String ville);
	public client verifier(String code,String psw);
	public List<articlebean> ListArt();
	public boolean Addcommande(commandebean cd,client clt);
	public List<commandebean>Listcommande(client clt);

}
