package com.example.Web_Projekat.entitydto;

import java.util.List;

import com.example.Web_Projekat.entity.Artikal;
import com.example.Web_Projekat.entity.Komentar;
import java.util.Set;

public class RestoranDto 
{
	private String naziv;
	
	private String tip_restorana;
	
	private String status;
	
	private String Lokacija;
	
	private List<Komentar> komentari;
	
	private Set<Artikal> artikli;
	
	private Long Menadzer_ID;
	

	
	
	public RestoranDto()
	{
		
	}


	public String getTip_restorana() {
		return tip_restorana;
	}


	public void setTip_restorana(String tip_restorana) {
		this.tip_restorana = tip_restorana;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public RestoranDto(String naziv, String tip_Restorana, String status, String LOkacija, List<Komentar> komentari,
			Set<Artikal> artikli, Long Menadzer_Id ) {
		super();
		this.naziv = naziv;
		this.tip_restorana = tip_Restorana;
		this.status = status;
		this.Lokacija = LOkacija;
		this.komentari = komentari;
		this.artikli = artikli;
		this.Menadzer_ID = Menadzer_Id;
	}
	



	public Long getMenadzer_ID() {
		return Menadzer_ID;
	}


	public void setMenadzer_ID(Long menadzer_ID) {
		Menadzer_ID = menadzer_ID;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getTip_Restorana() {
		return tip_restorana;
	}


	public void setTip_Restorana(String tip_Restorana) {
		tip_restorana = tip_Restorana;
	}


	public String getLokacija() {
		return Lokacija;
	}


	public void setLokacija(String lokacija) {
		Lokacija = lokacija;
	}


	public List<Komentar> getKomentari() {
		return komentari;
	}


	public void setKomentari(List<Komentar> komentari) {
		this.komentari = komentari;
	}


	public Set<Artikal> getArtikli() {
		return artikli;
	}


	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	}
	
	
	
	

}