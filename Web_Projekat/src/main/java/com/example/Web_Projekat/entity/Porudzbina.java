package com.example.Web_Projekat.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Porudzbina implements Serializable

{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
	
	/*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/
	
	//Veza Porudzbine sa Artiklima koji su na njoj
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Stavke_Porudzbine", joinColumns = {@JoinColumn(name = "porudzbina_id", referencedColumnName = "uuid")},
            inverseJoinColumns = {@JoinColumn(name = "artikal_id", referencedColumnName = "Id")})
    private Set<Artikal> artikli = new HashSet<>();
	
	@OneToOne
    @JoinColumn(name = "restoran_id")
    private Restoran restoran;
	
	@Column
	private Date Datum_i_Vreme;
	@Column
	private double Cena;
	
	@Column
	@Enumerated(EnumType.STRING)
    private StatusPorudzbine status;
	
	//Veza porudzbine i dostavljaca
	@ManyToOne
    @JoinColumn(name = "dostavljac_id")
    private Dostavljac dostavljac;
	
	
	//Veza Kupca i Porudzbine
	@ManyToOne
	@JoinColumn(name = "kupac_id")
    private Kupac1 kupac;
	
	
	

	public Porudzbina()
	{
		
	}
	
	public Porudzbina( Restoran restoran,  Date datum_i_Vreme, Kupac1 kupac, double cena,
			StatusPorudzbine status) 
	{
		this.uuid = uuid;
		this.restoran = restoran;
		this.Datum_i_Vreme = datum_i_Vreme;
		this.kupac = kupac;
		this.Cena = cena;
		this.status = status;

	}
	
	/*public Porudzbina( Restoran restoran, Date datum_i_Vreme, double cena,
			StatusPorudzbine status_porudzbine) 
	{
		this.uuid = uuid;
		this.restoran = restoran;
		this.Datum_i_Vreme = datum_i_Vreme;
		//this.kupac1 = kupac;
		this.Cena = cena;
		this.status_porudzbine = status_porudzbine;

	}*/
	

	
	
	
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	

	public Set<Artikal> getArtikli() {
		return artikli;
	}
	
	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	} 


	/*public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/


	public Kupac1 getKupac() {
		return kupac;
	}

	public void setKupac(Kupac1 kupac) {
		this.kupac = kupac;
	}
	

	public Restoran getRestoran() {
		return restoran;
	}

	public void setRestoran(Restoran restoran) {
		this.restoran = restoran;
	}

	public Date getDatum_i_Vreme() {
		return Datum_i_Vreme;
	}

	public void setDatum_i_Vreme(Date datum_i_Vreme) {
		Datum_i_Vreme = datum_i_Vreme;
	}

	public double getCena() {
		return Cena;
	}

	public void setCena(double cena) {
		Cena = cena;
	}

	public StatusPorudzbine getStatus() {
		return status;
	}

	public void setStatus(StatusPorudzbine status_porudzbine) {
		this.status = status_porudzbine;
	}

	public Dostavljac getDostavljac() {
		return dostavljac;
	}

	public void setDostavljac(Dostavljac dostavljac) {
		this.dostavljac = dostavljac;
	}




	

	
	
	

}
