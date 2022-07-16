package com.example.Web_Projekat.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Menadzer extends Korisnik  
{
	
	//Veza menadzera i restorana
	@OneToMany(mappedBy = "menadzer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Restoran> restorani = new HashSet<>();
	
	
	public Menadzer()
	{
		
	}
	
	public Menadzer(String username, String lozinka, String ime, String prezime, String pol, 
            String datum_rodjenja, Uloga role)
	{
		 super(username, lozinka,ime, prezime, pol, datum_rodjenja, role);
		
	}
	
	
	public Set<Restoran> getRestorani() {
		return restorani;
	}

	public void setRestorani(Set<Restoran> restorani) {
		this.restorani = restorani;
	}

}
