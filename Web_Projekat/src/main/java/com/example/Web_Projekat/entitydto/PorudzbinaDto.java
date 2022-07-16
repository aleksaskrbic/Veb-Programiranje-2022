package com.example.Web_Projekat.entitydto;



import com.example.Web_Projekat.entity.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PorudzbinaDto 
{
	private String id;
	
	private Set<Artikal> artikli = new HashSet();
	
	private Long restoranId;
	
	private Date Datum_i_Vreme;
	
	private double cena;
	
	private String status;
	
	private Long kupacId;
	
	private Long dostavljacId;
	
	public PorudzbinaDto()
	{
		
	}
	
    public PorudzbinaDto(Set<Artikal> artikli, Long restoranId, Date datumIVreme, double cena, String status, Long kupacId, Long dostavljacId) {
        this.artikli = artikli;
        this.restoranId = restoranId;
        this.Datum_i_Vreme = datumIVreme;
        this.cena = cena;
        this.status = status;
        this.kupacId = kupacId;
        this.dostavljacId = dostavljacId;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	}

	public Long getRestoranId() {
		return restoranId;
	}

	public void setRestoranId(Long restoranId) {
		this.restoranId = restoranId;
	}

	public Date getDatum_i_Vreme() {
		return Datum_i_Vreme;
	}

	public void setDatum_i_Vreme(Date datum_i_Vreme) {
		Datum_i_Vreme = datum_i_Vreme;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getKupacId() {
		return kupacId;
	}

	public void setKupacId(Long kupacId) {
		this.kupacId = kupacId;
	}

	public Long getDostavljacId() {
		return dostavljacId;
	}

	public void setDostavljacId(Long dostavljacId) {
		this.dostavljacId = dostavljacId;
	}
	
	
	

}
