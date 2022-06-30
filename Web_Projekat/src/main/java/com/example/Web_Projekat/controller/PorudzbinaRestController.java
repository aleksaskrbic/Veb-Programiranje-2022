package com.example.Web_Projekat.controller;


import java.io.ObjectInputFilter.Status;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.service.PorudzbinaService;
import com.example.Web_Projekat.service.RestoranService;
import com.example.Web_Projekat.entity.Dostavljac;
import com.example.Web_Projekat.entity.Kupac1;
import com.example.Web_Projekat.entity.PORUDZBINA;
import com.example.Web_Projekat.entity.Porudzbina;
import com.example.Web_Projekat.entity.Restoran;
import com.example.Web_Projekat.entity.StatusPorudzbine;
import com.example.Web_Projekat.entitydto.PorudzbinaDto;
import com.example.Web_Projekat.service.KorisniciService;


@RestController
public class PorudzbinaRestController 
{

	@Autowired
	private PorudzbinaService porudzbinaService;
	
	@Autowired
	private RestoranService restoranService;
	
	
	@Autowired
	private KorisniciService korisnikService;
	
	  //Kreiranje Porudzbine
	  @PostMapping("/api/porudzbina/create")
	    public String createPorudzbina(@RequestBody PorudzbinaDto porudzbinaDto) {
	        PORUDZBINA porudzbina = new PORUDZBINA();
	        porudzbina.setArtikli(porudzbinaDto.getArtikli());
	        porudzbina.setCena(porudzbinaDto.getCena());

	        Restoran restoran = restoranService.findOne(porudzbinaDto.getRestoranId());
	        porudzbina.setRestoran(restoran);
	        
	        porudzbina.setDatum_i_Vreme(new Date());
	        porudzbina.setStatus(StatusPorudzbine.Obrada);

	        Kupac1 kupac = (Kupac1) korisnikService.findOne(porudzbinaDto.getKupacId());
	        porudzbina.setKupac(kupac);
	        
	        Dostavljac dostavljac = (Dostavljac) korisnikService.findOne(porudzbinaDto.getDostavljacId());
	        porudzbina.setDostavljac(dostavljac);
	        
	        

	        this.porudzbinaService.savePorudzbina(porudzbina);
	        return "Uspesno kreirana porudzbina!";
	    }
	  
	  
	  //Izlistavanje Svih POrudzbina
	  @GetMapping("/api/porudzbine")
	    public ResponseEntity<List<PORUDZBINA>> getPorudzbine() 
	    {
	        List<PORUDZBINA> porudzbine = porudzbinaService.findAll();
	        
	        return ResponseEntity.ok(porudzbine); 
	    }
	  
	  // Pronalazenje Porudzbine po Kupcu
	  @GetMapping("/api/porudzbine/kupac/{id}")
	    public ResponseEntity<List<PORUDZBINA>> getPorudzbineByKupac(@PathVariable(name = "id") Long id) {
	        List<PORUDZBINA> porudzbine = porudzbinaService.getPorudzbineByKupac(id);
	        return ResponseEntity.ok(porudzbine);
	    }
	  
	  
	  //Uzimanje POrudzbine prema restoranu
	  @GetMapping("/api/porudzbine/restoran/{id}")
	    public ResponseEntity<List<PORUDZBINA>> getPorudzbineByRestoran(@PathVariable(name = "id") Long id) {
	        List<PORUDZBINA> porudzbine = porudzbinaService.getPorudzbineByRestoran(id);
	        return ResponseEntity.ok(porudzbine);
	    }
	  
	  //Prikaz porudzbina po statusu
	  @GetMapping("/api/porudzbine/status/{status}")
	    public ResponseEntity<List<PORUDZBINA>> getPorudzbineByKupac(@PathVariable(name = "status") String status) {
	        List<PORUDZBINA> porudzbine = porudzbinaService.getPorudzbineByStatus(StatusPorudzbine.valueOf(status.toUpperCase()));
	        return ResponseEntity.ok(porudzbine);
	    }
	
	
	
}
