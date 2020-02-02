package com.gestion.beans;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Tab_commande")
public class commandebean implements Serializable {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="Ref_cmd") 
	private int ref;
	@Column(nullable=false) 
	private LocalDate date;
	@Column(name="Montant_cmd", length=30) 
	private int somme;
	@ManyToOne
	@JoinColumn(name="Code")
	private client client;
	
	public client getclient() {
		return client;
	}
	public void setclient(client client) {
		this.client = client;
	}
	

	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public commandebean() {}

	public commandebean(LocalDate date, int somme,client client) {
		super();
		this.date = date;
		this.somme = somme;
		this.client = client;
	}
	public commandebean(Object object, Object object2, Object object3) {
		// TODO Auto-generated constructor stub
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getSomme() {
		return somme;
	}

	public void setSomme(int somme) {
		this.somme = somme;
	}

	public client getClient() {
		return client;
	}

	public void setClient(client client) {
		this.client = client;
	}

	

}
