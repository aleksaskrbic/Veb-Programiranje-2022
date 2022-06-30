package com.example.Web_Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.entity.Artikal;
import com.example.Web_Projekat.entity.Komentar;
import com.example.Web_Projekat.entity.Kupac1;
import com.example.Web_Projekat.entity.Restoran;
import com.example.Web_Projekat.entity.TipHrane;
import com.example.Web_Projekat.entitydto.ArtikalDto;
import com.example.Web_Projekat.entitydto.KomentarDto;
import com.example.Web_Projekat.service.KomentariService;
import com.example.Web_Projekat.service.KorisniciService;
import com.example.Web_Projekat.service.RestoranService;


@RestController
public class KomentarRestController 
{
	
	@Autowired
	private KorisniciService korisniciService;
	
	@Autowired
	private RestoranService restoranService;
	
	@Autowired
	private KomentariService komentarService;
	
	@PostMapping("/api/komentar/create")
	public String createArtikal(@RequestBody KomentarDto komentarDto) {
	    Komentar komentar = new Komentar();
	    
	    long broj = 2;
	    
	  /* Kupac1 kupac;
	   kupac = korisniciService.findOne(broj);
	   komentar.setKupac(kupac);*/
	   
	   Restoran restoran;
	   restoran = restoranService.findOne(komentarDto.getRestoran_id());
	   
	   komentar.setOcena(komentarDto.getOcena());
	   komentar.setTekst_komentara(komentarDto.getTekst_komentara());
	   
	   this.komentarService.save(komentar);
	   
	    
	    
	    return "Uspesno dodat Novi Komentar!";
	}
	

}



