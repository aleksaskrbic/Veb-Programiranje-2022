package com.example.Web_Projekat.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class Dostavljac extends Korisnik  implements Serializable
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	//Veza Sa Porudzbinama
	@OneToMany(mappedBy = "dostavljac", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<PORUDZBINA> porudzbine = new HashSet<>();

	
	public Dostavljac()
	{
		
	}
	
	public Dostavljac(String username, String lozinka, String ime, String prezime, String pol, 
            String datum_rodjenja, Uloga role)
	{
		 super(username, lozinka,ime, prezime, pol, datum_rodjenja, role);
	}
	
	public Set<PORUDZBINA> getPorudzbine() {
		return porudzbine;
	}

	public void setPorudzbine(Set<PORUDZBINA> porudzbine) {
		this.porudzbine = porudzbine;
	}


}
