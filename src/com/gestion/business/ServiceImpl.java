package com.gestion.business;

import java.util.List;
import java.util.Set;

import com.gestion.beans.articlebean;
import com.gestion.beans.client;
import com.gestion.beans.commandebean;
import com.gestion.dao.UtilDao;
import com.gestion.dao.UtilDaoImpl;

public class ServiceImpl implements Service {

	UtilDao Udao=new UtilDaoImpl();  
	@Override
	public boolean ajouterUsers(String code, String password, String name, String addresse, String ville) {

		return Udao.addUser(code, password, name, addresse, ville);
	}
	@Override
	public client verification(String code,String psw) {
		 client cl=Udao.verifier(code,psw);
		return cl;
       }
	@Override
	public List<articlebean> Affichearicle() {
		
		List<articlebean> l=Udao.ListArt();
		return l;
	}
	@Override
	public boolean ajoutecommande(commandebean cd,client clt) {
		
		return Udao.Addcommande(cd,clt);
	}
	@Override
	public List<commandebean> lister_commande(client clt) {
		
		return Udao.Listcommande(clt);
	}
}