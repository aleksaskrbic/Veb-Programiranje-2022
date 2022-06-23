package com.example.Web_Projekat.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class TipKupca implements Serializable

{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private Tip tip;
	
	private int popust;
	
	private int trazeni_broj_poena;
	
	public TipKupca()
	{
		
	}
	
	public TipKupca(Tip tip_kupca, int Popust, int poeni)
	{
		super();
		this.tip = tip_kupca;
		this.popust = Popust;
		this.trazeni_broj_poena = poeni;
	}
	
	
	/*public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	public Tip getTip() {
		return tip;
	}
	public void setTip(Tip tip) {
		this.tip = tip;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public int getBroj_poena() {
		return trazeni_broj_poena;
	}
	public void setBroj_poena(int broj_poena) {
		this.trazeni_broj_poena = broj_poena;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
