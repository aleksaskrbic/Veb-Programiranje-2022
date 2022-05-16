package com.example.Web_Projekat.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Korisnik implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	private String lozinka;
	@Column
	private String ime;
	@Column
	private String prezime;
	@Column
	private String pol;
	@Column
	private String datum_rodjenja;
	@Column
	private Uloga role;
	
	public Korisnik()
	{
		
	}
	
	public Korisnik(String Korisnicko_Ime, String Lozinka, String Ime, String Prezime, String Pol, String Datum_Rodjenja, Uloga Role)
	{
		super();
		//this.id = ID;
		this.username = Korisnicko_Ime;
		this.lozinka = Lozinka;
		this.ime = Ime;
		this.prezime = Prezime;
		this.pol   = Pol;
		this.datum_rodjenja = Datum_Rodjenja;
		this.role  = Role;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}
	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public Uloga getRole() {
		return role;
	}
	public void setRole(Uloga role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
