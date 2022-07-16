package com.example.Web_Projekat.entitydto;

public class KomentarDto 
{
	private Long kupac_id;
	
	private Long restoran_id;
	
	private String tekst_komentara;
	
	private int ocena;
	
	public KomentarDto()
	{
		super();
	}

	public KomentarDto(Long kupac_id, Long restoran_id, String tekst_komentara, int ocena) {
		super();
		this.kupac_id = kupac_id;
		this.restoran_id = restoran_id;
		this.tekst_komentara = tekst_komentara;
		this.ocena = ocena;
	}

	public Long getKupac_id() {
		return kupac_id;
	}

	public void setKupac_id(Long kupac_id) {
		this.kupac_id = kupac_id;
	}

	public Long getRestoran_id() {
		return restoran_id;
	}

	public void setRestoran_id(Long restoran_id) {
		this.restoran_id = restoran_id;
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
	

	

}
