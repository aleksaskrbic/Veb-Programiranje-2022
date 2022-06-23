package com.example.Web_Projekat.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Columns;



@Entity
public class Kupac extends Korisnik 

{


/*	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column
	//private Korisnik korisnik
   //@Column
	@Column
	private int broj_sakupljenih_poena;
	@Column
	private Tip tip_kupca;
	 
	 
	 //Veza Kupca i Porudzbina 
    	 @ManyToMany
	    @JoinTable(name = "kupac_porudzbina",
	    joinColumns = @JoinColumn(name = "kupac_id", referencedColumnName = "id"),
	    inverseJoinColumns = @JoinColumn(name = "porudzbina_id", referencedColumnName = "id"))
		private Set<Porudzbina> porudzbine = new HashSet<>();
		
	
	public Kupac()
	{
		//tip_kupca = new TipKupca1();
	}
	
	public Kupac( Tip tip, int broj_sakupljenih_poena) 
	{
		super();
		//this.korisnik = korisnik;
		//this.tip_kupca = tip_kupca = new TipKupca1(tip, Popust, broj_poena);
		this.broj_sakupljenih_poena = broj_sakupljenih_poena;
		this.tip_kupca = tip;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public int getBroj_sakupljenih_poena() {
		return broj_sakupljenih_poena;
	}

	public void setBroj_sakupljenih_poena(int broj_sakupljenih_poena) {
		this.broj_sakupljenih_poena = broj_sakupljenih_poena;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}*/
	

}