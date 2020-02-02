package com.gestion.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class articlebean implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id")
	 private int code;
     
	@Column(name="desi")
	private String desi;
	
	@Column(name="prix") 
	private Integer prix;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public articlebean(int code, String desi, int prix) {
		super();
		this.code = code;
		this.desi = desi;
		this.prix = prix;
	}
	public articlebean() {}
}
