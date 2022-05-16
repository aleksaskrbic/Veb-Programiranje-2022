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
	@Column
	private Tip tip;
	@Column
	private int popust;
	@Column
	private int trazeni_broj_poena;
	
	public TipKupca()
	{
		this.tip = tip.drveni;
		this.popust = 0;
		this.trazeni_broj_poena = 0;
	}
	
	public TipKupca(long Id, Tip TIP, int Popust, int Poeni)
	{
		super();
		this.id = Id;
		this.tip = TIP;
		this.popust = Popust;
		this.trazeni_broj_poena = Poeni;
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
