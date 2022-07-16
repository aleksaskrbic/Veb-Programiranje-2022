package com.example.Web_Projekat.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Web_Projekat.entity.Korisnik;
import com.example.Web_Projekat.entity.Uloga;

import org.springframework.stereotype.Repository;


@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, Serializable> 
{      

	Korisnik getByUsername(String username);
    //Korisnik getByKorisnickoIme(String korisnickoIme);
	Korisnik getByRole(Uloga role);
	
	Korisnik getByIme(String ime);
	Korisnik getByPrezime(String prezime);
	
	
	
}







