package com.example.Web_Projekat.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Komentar implements Serializable 

{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "kupac_id")
	private Kupac1 kupac;
	
	@OneToOne
	@JoinColumn(name = "restoran_id")
	private Restoran restoran;
	
	
	@Column
	private String tekst_komentara;
	@Column
	private int ocena;
	
	public Komentar()
	{
		super();
	}
	
	public Komentar(Kupac1 kupac, Restoran restoran, String tekst_komentara, int ocena) {
		super();
		//id = ID;
		this.kupac = kupac;
		this.restoran = restoran;
		this.tekst_komentara = tekst_komentara;
		this.ocena = ocena;
	}

	
	
	/*public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	
	
	
	public Kupac1 getKupac() {
		return kupac;
	}

	public void setKupac(Kupac1 kupac) {
		this.kupac = kupac;
	}

	public Restoran getRestoran() {
		return restoran;
	}

	public void setRestoran(Restoran restoran) {
		this.restoran = restoran;
	}

	public String getTekst_komentara() {
		return tekst_komentara;
	}

	public void setTekst_komentara(String tekst_komentara) {
		this.tekst_komentara = tekst_komentara;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
