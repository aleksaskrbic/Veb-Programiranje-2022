package com.example.Web_Projekat.entitydto;

import com.example.Web_Projekat.entity.Uloga;

public class KorisnikDto 
{
	

    private String username;

    private String ime;
    
    private String lozinka;

    private String prezime;

    private String pol;

    private String datum_rodjenja;

    private Uloga role;

    public KorisnikDto() {
    }

    public KorisnikDto(String username, String lozinka, String ime, String prezime, String pol, String datum, Uloga uloga) {
        this.username = username;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.datum_rodjenja = datum;
        this.role = uloga;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

  /*  public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }*/

}
