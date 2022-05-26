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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


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
	private Long id;
	@Column
	private String naziv;
	@Column
	private String tip_restorana;
	@Column
	private String lokacija;
	
	@Column
	private StatusRestorana status;
	
	//Druga strana veze sa menadzerima
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	private Menadzer menadzer;
	
	//Veza Restorana i Artikala
	@OneToMany(mappedBy = "restoran", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Artikal> artikli = new HashSet<>();

	public Restoran()
	{
		super();
	}
	
	public Restoran(long Id,String Naziv, StatusRestorana status, Set<Artikal> artikli, String tip, String Lokacija)
	{
		this.id = Id;
		this.naziv=Naziv;
		this.status = status;
		this.tip_restorana = tip;
		this.lokacija = Lokacija;
		this.artikli = artikli;
		
	}
	

		
	
	


	public String getTip_restorana() {
		return tip_restorana;
	}

	public void setTip_restorana(String tip_restorana) {
		this.tip_restorana = tip_restorana;
	}

	public StatusRestorana getStatus() {
		return status;
	}

	public void setStatus(StatusRestorana status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	

	public Set<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	}

	
	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public Menadzer getMenadzer() {
		return menadzer;
	}

	public void setMenadzer(Menadzer menadzer) {
		this.menadzer = menadzer;
	}

	/*public TipRestorana getTip_restorana() {
		return tip_restorana;
	}

	public void setTip_restorana(TipRestorana tip_restorana) {
		this.tip_restorana = tip_restorana;
	}*/

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