package com.example.Web_Projekat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;




public class TipKupca1 
{
	
	
	
	public Tip tip;
	
	public int popust;
	
	public int broj_poena;
	
	public TipKupca1()
	{
		this.tip = tip.drveni;
		this.popust = 0;
		this.broj_poena = 0;
	}
	
	public TipKupca1( Tip TIP, int Popust, int Poeni)
	{
		super();
		this.tip = TIP;
		this.popust = Popust;
		this.broj_poena = Poeni;
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
		return broj_poena;
	}
	public void setBroj_poena(int broj_poena) {
		this.broj_poena = broj_poena;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}









