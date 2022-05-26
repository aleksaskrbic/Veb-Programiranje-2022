package com.example.Web_Projekat.service;
import com.example.Web_Projekat.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.repository.ArtikalRepository;
import com.example.Web_Projekat.repository.KorisnikRepository;

import java.util.List;
import java.util.Optional;



@Service
public class KorisniciService 
{
   @Autowired
   private  KorisnikRepository korisniciRepository;
   
   
 /*  //Logovanje
   public Korisnik login(String korisnickoIme, String lozinka) {
       Korisnik korisnik = korisniciRepository.getByKorisnickoIme(korisnickoIme);
       if (korisnik == null || !korisnik.getLozinka().equals(lozinka))
           return null;
       return korisnik;
   }
   
   //Uzimanje Korisnickog imena
   public Korisnik getByKorisnickoIme(String korisnickoIme) {
       Korisnik korisnik = korisniciRepository.getByKorisnickoIme(korisnickoIme);
       return korisnik;
   }*/

   //Regitrovanje Korisnika
   
   public Korisnik RegisterKorisnik(Korisnik korisnik)
   {
	   return korisniciRepository.save(korisnik);
   }
   
   
   //Prikaz Svih Korisnika
   public List<Korisnik> findAll()
   {
       return korisniciRepository.findAll();
   }
   
   //Prikaz Jednog Korisnika
   
   public Korisnik findOne(Long id) {
       Optional<Korisnik> korisnik = korisniciRepository.findById(id);
       if (korisnik.isPresent())
           return korisnik.get();

       return null;
   }
   
   //Logovanje Korisnika
   public Korisnik login(String username, String lozinka) {
       Korisnik korisnik = korisniciRepository.getByUsername(username);
       if (korisnik == null || !korisnik.getLozinka().equals(lozinka))
           return null;
     return korisnik;
   }
   
   //Vadjenje Jednog Korisnika po Korisnickom Imenu
   
      
      
      public  Korisnik getByUsername(String username)
      {
    	  Korisnik korisnik = korisniciRepository.getByUsername(username);
    	  return korisnik;
      }
      
      public  Korisnik getByRole(Uloga role)
      {
    	  Korisnik korisnik = korisniciRepository.getByRole(role);
    	  return korisnik;
      }
      
      public Korisnik save(Korisnik korisnik) 
      {
          return korisniciRepository.save(korisnik);
      }
   
}
