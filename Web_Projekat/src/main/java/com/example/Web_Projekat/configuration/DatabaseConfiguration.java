package com.example.Web_Projekat.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Web_Projekat.entity.*;
import com.example.Web_Projekat.repository.*;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class DatabaseConfiguration 

{
	 @Autowired
	    private ArtikalRepository artikalRepository;

	 

	    @Autowired
	    private RestoranRepository restoranRepository;

	    @Autowired
	    private MenadzerRepository menadzerRepository;

	    @Autowired
	    private DostavljacRepository dostavljacRepository;

	    @Autowired
	    private Kupac1Repository kupacRepository;

	    @Autowired
	    private PORUDZBINARepository porudzbinaRepository;
	    
	    @Autowired
	    private KomentarRepository komentarRepository;

	    @Autowired
	    private  KorisnikRepository korisnikRepository;
	    
	    @Bean
	    public boolean instantiate()
	    {
	    
	   
	    
	    //Dodavanje KOrisnika
	    Korisnik korisnik = new Korisnik();
	    korisnik.setIme("Marko");
	    korisnik.setPrezime("Markovic");
	    korisnik.setPol("Muski");
	    korisnik.setDatum_rodjenja("12-02-1998");
	    korisnik.setUsername("marko");
	    korisnik.setLozinka("marko");
	    korisnik.setRole(Uloga.Administrator);
	    
	    korisnikRepository.save(korisnik);
	    
	    //Kupac
	    Kupac1 kupac = new Kupac1();
	    kupac.setUsername("jovan");
	    kupac.setLozinka("kupac");
	    kupac.setIme("Jovan");
	    kupac.setPrezime("Petrovic");
	    kupac.setDatum_rodjenja("12-02-1996");
	    kupac.setPol("Muski");
	    kupac.setRole(Uloga.Kupac);
	    kupac.setUkupan_Broj_Poena(212);
	    kupac.setTip(Tip.zlatni);
	    
	    
	    kupacRepository.save(kupac);
	    
	    //Dostavljac
	    Dostavljac dostavljac = new Dostavljac();
	    dostavljac.setUsername("srdjan");
	    dostavljac.setLozinka("dostava");
	    dostavljac.setIme("Srdjan");
	    dostavljac.setPrezime("Jovanovic");
	    dostavljac.setDatum_rodjenja("12-02-1996");
	    dostavljac.setPol("Muski");
	    dostavljac.setRole(Uloga.Dostavljac);
	    
	    dostavljacRepository.save(dostavljac);
	    
	    //Menadzer
	    
	    
	    Menadzer menadzer = new Menadzer();
	    menadzer.setUsername("nikoola");
	    menadzer.setLozinka("menadzer");
	    menadzer.setIme("Nikola");
	    menadzer.setPrezime("Nikolic");
	    menadzer.setDatum_rodjenja("12-02-1993");
	    menadzer.setPol("Muski");
	    menadzer.setRole(Uloga.Menadzer);
	   
	    
	    
	    menadzerRepository.save(menadzer);
	   
	    
	    
	    
	   
	    
	    
	    
	    Restoran restoran = new Restoran();
	    restoran.setNaziv("Korejska Cetvrt");
	    restoran.setLokacija("Novosadska 15");
	    restoran.setStatus(StatusRestorana.Radi);
	    restoran.setTip_restorana("Korejski Restoran");
	    restoran.setArtikli(null);
	    
	    
	    Restoran restoran1 = new Restoran();
	    restoran1.setNaziv("Srpska Posla");
	    restoran1.setLokacija("Sarajevska 15");
	    restoran1.setStatus(StatusRestorana.Radi);
	    restoran1.setTip_restorana("Srpski Restoran");
	    restoran1.setArtikli(null);
	    restoran1.setMenadzer(null);
	    
	    restoranRepository.save(restoran1);
	    
	    
	    restoranRepository.save(restoran);
	    
	    
	    
	   
	    
	    
	 
	    
	    Artikal artikal = new Artikal();
	    artikal.setNaziv("Pasta");
	    artikal.setOpis("Pasta na talijanski nacin");
	    artikal.setCena(255);
	    artikal.setKolicina(23);
	    artikal.setTip_hrane(TipHrane.Jelo);
	    artikal.setRestoran(restoran);
	    
	    
	    Artikal artikal1 = new Artikal();
	    artikal1.setNaziv("Piletina");
	    artikal1.setOpis("Ljuta piletina");
	    artikal1.setCena(260);
	    artikal1.setKolicina(33);
	    artikal1.setTip_hrane(TipHrane.Jelo);
	    artikal1.setRestoran(restoran);
	    
	    
	    Artikal artikal2 = new Artikal();
	    artikal2.setNaziv("Pasta");
	    artikal2.setOpis("Pasta na talijanski nacin");
	    artikal2.setCena(255);
	    artikal2.setKolicina(23);
	    artikal2.setTip_hrane(TipHrane.Jelo);
	    artikal2.setRestoran(restoran1);
	    
	    artikalRepository.save(artikal);
	    artikalRepository.save(artikal1);
	    artikalRepository.save(artikal2);
	    
	    
	    //Delovi za Porudzbine
	    
	      Set<Artikal> artikli = new HashSet<>();
	        artikli.add(artikal);
	        artikli.add(artikal1);

	        PORUDZBINA porudzbina = new PORUDZBINA();
	        porudzbina.setCena(artikal.getCena() + artikal1.getCena());
	        porudzbina.setStatus(StatusPorudzbine.U_Pripremi);
	        porudzbina.setDatum_i_Vreme(new Date());
	        porudzbina.setKupac(kupac);
	        porudzbina.setRestoran(restoran);
	        porudzbina.setDostavljac(dostavljac);
	        porudzbina.setArtikli(artikli);
	        porudzbinaRepository.save(porudzbina);
	        
	        //Kreiranje Komentara
	        
	        Komentar komentar = new Komentar();
	        komentar.setKupac(kupac);
	        komentar.setRestoran(restoran);
	        komentar.setOcena(10);
	        komentar.setTekst_komentara("Hrana je odlicna");
	        komentarRepository.save(komentar);
	    
	    
	    return true;

	    }
}
