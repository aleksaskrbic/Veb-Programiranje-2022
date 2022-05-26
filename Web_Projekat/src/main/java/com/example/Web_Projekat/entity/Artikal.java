package com.example.Web_Projekat.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Artikal implements Serializable

{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id; 
	@Column
	private String naziv;
	@Column
	@Enumerated(EnumType.STRING)
	private TipHrane tip_hrane;
	@Column
	private int kolicina;
	@Column
	private String opis;
	@Column
	private double Cena;

	
	@ManyToOne
    @JoinColumn(name = "restoran_id")
    private Restoran restoran;
	
	public Artikal()
	{
		super();
	}
	public double getCena() {
		return Cena;
	}
	public void setCena(double cena) {
		this.Cena = cena;
	}
	public Restoran getRestoran() {
		return restoran;
	}
	public void setRestoran(Restoran restoran) {
		this.restoran = restoran;
	}

	
	
	
	

	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
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

