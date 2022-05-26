package com.example.Web_Projekat.entitydto;

public class ArtikalDto 
{

	private String naziv;
	
	private String tip_hrane;
	
	private int kolicina;
	
	private String opis;
	
	private double Cena;
	
	private Long Restoran_ID;
	
	
	
	public ArtikalDto()
	{
		
	}



	public ArtikalDto(String naziv, String tip_hrane, int kolicina, String opis, double cena, Long restoran_ID) 
	{
		super();
		this.naziv = naziv;
		this.tip_hrane = tip_hrane;
		this.kolicina = kolicina;
		this.opis = opis;
		this.Cena = cena;
		this.Restoran_ID = restoran_ID;
	}



	public double getCena() {
		return Cena;
	}



	public void setCena(double cena) {
		this.Cena = cena;
	}



	public Long getRestoran_ID() {
		return Restoran_ID;
	}



	public void setRestoran_ID(Long restoran_ID) {
		Restoran_ID = restoran_ID;
	}



	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTip_hrane() {
		return tip_hrane;
	}

	public void setTip_hrane(String tip_hrane) {
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
}
