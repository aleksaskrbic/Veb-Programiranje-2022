package com.example.Web_Projekat.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Porudzbina implements Serializable 

{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String sifra_narudzbine;
	@Column
	private double cena;
	@Column
	private String datum;
	@Column
	private String id_kupca;
	@Column
	private int id_restroana;
	/*@Column
	private List<String> artikli;*/
	@Column
	private StatusPorudzbine status_porudzbine;
	
	//Druga strana veze sa kupcom
	// @ManyToMany(mappedBy = "porudzbine")
	 //private Set<Kupac> kupci = new HashSet<>();

	
	 //Druga strana veze sa dostavljacima
		@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
    	private Dostavljac dostavljac;

	
	public Porudzbina()
	{
		
	}
	
	public Porudzbina( String sifra_narudzbine,  double cena, String datum, String id_kupca, int id_restorana,
			StatusPorudzbine status_porudzbine) {
		super();
		this.sifra_narudzbine = sifra_narudzbine;
		//this.id = id;
		this.cena = cena;
		this.datum = datum;
		this.id_kupca = id_kupca;
		this.id_restroana = id_restroana;
		//this.artikli = artikli;
		this.status_porudzbine = status_porudzbine;
	}
	
	

	


	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getId_kupca() {
		return id_kupca;
	}
	public void setId_kupca(String id_kupca) {
		this.id_kupca = id_kupca;
	}
	public int getId_restroana() {
		return id_restroana;
	}
	public void setId_restroana(int id_restroana) {
		this.id_restroana = id_restroana;
	}
	
	public StatusPorudzbine getStatus_porudzbine() {
		return status_porudzbine;
	}
	public void setStatus_porudzbine(StatusPorudzbine status_porudzbine) {
		this.status_porudzbine = status_porudzbine;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
