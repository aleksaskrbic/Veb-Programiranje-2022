package com.example.Web_Projekat.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lokacija implements Serializable 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

    @Column
	private double geografska_duzina;
	@Column
	private double geografska_sirina;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String adresa;
	
	
	public Lokacija()
	{
		super();
	}
	
	public Lokacija( double GD,double GS, String Adresa)
	{
		
		this.geografska_duzina = GD;
		this.geografska_sirina = GS;
		this.adresa = Adresa;
	}
	
	

	public double getGeografska_duzina() {
		return geografska_duzina;
	}

	public void setGeografska_duzina(double geografska_duzina) {
		this.geografska_duzina = geografska_duzina;
	}

	public double getGeografska_sirina() {
		return geografska_sirina;
	}

	public void setGeografska_sirina(double geografska_sirina) {
		this.geografska_sirina = geografska_sirina;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}



}
