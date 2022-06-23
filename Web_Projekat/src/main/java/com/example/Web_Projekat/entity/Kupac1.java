package com.example.Web_Projekat.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Kupac1 extends Korisnik implements Serializable
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	//Veza kupca sa Porudzbinama
    @OneToMany(mappedBy = "kupac", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Porudzbina> svePorudzbine = new HashSet<>();
    
	@Column
    private int Ukupan_Broj_Poena;
    
    @OneToOne
    @JoinColumn(name = "tip_kupca_id")
    private TipKupca tipKupca;
    
    public Kupac1(String username, String lozinka, String ime, String prezime, String pol, 
    		String datum_rodjenja, Uloga role, int broj_poena, TipKupca tip_kupca)
    {
    	super(username, lozinka,ime, prezime, pol, datum_rodjenja, role);
    	this.Ukupan_Broj_Poena = broj_poena;
    	this.tipKupca = tip_kupca;
    }

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Porudzbina> getSvePorudzbine() {
		return svePorudzbine;
	}

	public void setSvePorudzbine(Set<Porudzbina> svePorudzbine) {
		this.svePorudzbine = svePorudzbine;
	}

	public int getUkupan_Broj_Poena() {
		return Ukupan_Broj_Poena;
	}

	public void setUkupan_Broj_Poena(int ukupan_Broj_Poena) {
		Ukupan_Broj_Poena = ukupan_Broj_Poena;
	}

	public TipKupca getTipKupca() {
		return tipKupca;
	}

	public void setTipKupca(TipKupca tipKupca) {
		this.tipKupca = tipKupca;
	}


}
