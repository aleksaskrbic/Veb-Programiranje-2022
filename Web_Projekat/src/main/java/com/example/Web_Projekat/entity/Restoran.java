package com.example.Web_Projekat.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.Web_Projekat.entity.Menadzer;
import com.example.Web_Projekat.entity.Lokacija;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Restoran implements Serializable 

{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String naziv;
	@Column
	private TipRestorana tip_restorana;
	@Column
	private String lokacija;
	//private List<String> artikli;
	
	//Druga strana veze sa menadzerima
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	private Menadzer menadzer;

	
	public Restoran()
	{
		super();
	}
	
	public Restoran(long Id,String Naziv, TipRestorana tip, String Lokacija)
	{
		this.id = Id;
		this.naziv=Naziv;
		this.tip_restorana = tip;
		this.lokacija = Lokacija;
		
	}
	

		
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public TipRestorana getTip_restorana() {
		return tip_restorana;
	}

	public void setTip_restorana(TipRestorana tip_restorana) {
		this.tip_restorana = tip_restorana;
	}

	/*public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija lokacija) {
		this.lokacija = lokacija;
	}*/
	

	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
}