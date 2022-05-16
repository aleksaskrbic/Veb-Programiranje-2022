package com.example.Web_Projekat.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;





@Entity
public class Dostavljac extends Korisnik 
{

	
	//Veza Sa Porudzbinama
	@OneToMany(mappedBy = "dostavljac", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Porudzbina> porudzbine = new HashSet<>();

	
	public Set<Porudzbina> getPorudzbine() {
		return porudzbine;
	}

	public void setPorudzbine(Set<Porudzbina> porudzbine) {
		this.porudzbine = porudzbine;
	}


}
