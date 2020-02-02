package com.gestion.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="client")
public class client implements Serializable{

	@Id  
	@Column(name="Code") 
	private String code; 
	@Column(name="Password")
	private String password;
	@Column(name="Nom", length=30) 
	private String nom; 
	@Column(name="Addrese", length=30) 
	private String adresse; 
	@Column(name="Ville", length=30) 
	private String ville;
	@OneToMany(mappedBy="client")
	private List<commandebean>commandes=new ArrayList<>();
	
	public List<commandebean> getCommandes() {
		return commandes;
	}
	public void ListCommandes(List<commandebean> commandes) {
		this.commandes = commandes;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public client(String code, String password, String nom, String adresse, String ville) {
		super();
		this.code = code;
		this.password = password;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
	} 
	public client() {}
}
