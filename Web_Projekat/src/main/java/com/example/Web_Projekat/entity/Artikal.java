package com.example.Web_Projekat.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Artikal implements Serializable

{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id; 
	@Column
	private String naziv;
	@Column
	private TipHrane tip_hrane;
	@Column
	private int kolicina;
	@Column
	private String opis;

	
	public Artikal()
	{
		super();
	}
	public Artikal(String Naziv, TipHrane tip, int Kolicina, String Opis)
	{
		//this.Id = ID;
		this.naziv = Naziv;
		this.tip_hrane = tip;
		this.kolicina = Kolicina;
		this.opis = Opis;
	}
	
	
	

	
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public TipHrane getTip_hrane() {
		return tip_hrane;
	}
	public void setTip_hrane(TipHrane tip_hrane) {
		this.tip_hrane = tip_hrane;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	

	@Override
	public String toString() {
		return super.toString();
	}
}

