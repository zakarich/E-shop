package com.gestion.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.gestion.beans.articlebean;
import com.gestion.beans.client;
import com.gestion.beans.commandebean;
import com.gestion.dao.HibernateUtile;

public class UtilDaoImpl implements UtilDao{

	@Override
	public boolean addUser(String code, String password, String name, String addresse, String ville) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		client clt=new client(code,password, name, addresse,ville); 
		session.save(clt); 
		session.getTransaction().commit(); 
		session.close(); 
		return true; 
	}

	@Override
	public client verifier(String code,String psw) {
		Session session=HibernateUtile.getSessionFactory().openSession(); 
		session.beginTransaction(); 
		client clt= (client) session.createQuery("from client where code='"+code+"' and password='"+psw+"' ").uniqueResult();
		session.getTransaction().commit();
		session.close();
		return clt;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<articlebean> ListArt() {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		List<articlebean> list=session.createQuery("from articlebean").list();
		session.getTransaction().commit(); 
		session.close();
		return list;
	}

	@Override
	public boolean Addcommande(commandebean cd,client clt) {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		clt.getCommandes().add(cd);
		session.evict(clt);
		session.update(clt);
		cd.setclient(clt);
		//////////
		session.save(cd);
		session.getTransaction().commit(); 
		session.close();
		return true; 
	}

	@Override
	public List<commandebean> Listcommande(client clt) {
		Session session=HibernateUtile.getSessionFactory().openSession();
		session.beginTransaction();
		List<commandebean>cmds=clt.getCommandes();
		session.getTransaction().commit(); 
		session.close();
		return cmds;
	}

}
