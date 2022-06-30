package com.example.Web_Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.service.KomentariService;
import com.example.Web_Projekat.service.KorisniciService;
import com.example.Web_Projekat.service.MenadzerService;
import com.example.Web_Projekat.service.RestoranService;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.Web_Projekat.entity.Komentar;
import com.example.Web_Projekat.entity.Korisnik;
import com.example.Web_Projekat.entity.Menadzer;
import com.example.Web_Projekat.entity.Restoran;
import com.example.Web_Projekat.entity.StatusRestorana;
import com.example.Web_Projekat.entity.TipHrane;
import com.example.Web_Projekat.entity.Uloga;
import com.example.Web_Projekat.entitydto.KorisnikDto;
import com.example.Web_Projekat.entitydto.RestoranDto;

@RestController
public class RestoranRestController 
{
	
	@Autowired
	private RestoranService restoranService;
	
	@Autowired
	private KorisniciService korisnikService;
	
	@Autowired
	private KomentariService komentarService;
	
	@Autowired
	private MenadzerService menadzerService;
	
	
     @GetMapping("/api/restorani")
    public ResponseEntity<List<Restoran>> getRestorani() 
    {
        List<Restoran> restorani = restoranService.findAll();
        
        return ResponseEntity.ok(restorani); 
    }
	 

	 /*   @GetMapping("/api/restorani")
	       public List <Restoran> getRestorani1()
	       {
	    	List <Restoran> listaRestorana = restoranService.findAll();
			return listaRestorana;
	       }*/
     
     @GetMapping("/api/restorani/{id}")
     public ResponseEntity<RestoranDto> getById(@PathVariable("id") Long id) {

         Restoran restoran = restoranService.findOne(id);
         List<Komentar> komentari = komentarService.getByRestoranId(id);

         RestoranDto restoranDto = new RestoranDto();
         restoranDto.setNaziv(restoran.getNaziv());
         restoranDto.setTip_Restorana(restoran.getTip_restorana());
         
         //restoranDto.setLokacijaId(restoran.getLokacija().getId());
         
         restoranDto.setArtikli(restoran.getArtikli());
         restoranDto.setKomentari(komentari);
         restoranDto.setStatus(restoran.getStatus().toString());
         restoranDto.setLokacija(restoran.getLokacija());
         
         //restoranDto.setMenadzer_ID(restoran.getMenadzer().getId());
         return ResponseEntity.ok(restoranDto);
     }
	    
	    
	    
	
	    
	    //Kreiranje Novog Restorana
	    @PostMapping("/api/restoran/create")
	    public ResponseEntity<String> createRestoran(@RequestBody RestoranDto restoranDto) {

	        if (restoranDto.getNaziv().isEmpty()) //|| restoranDto.getTip_Restorana().isEmpty()) 
	        {
	            return new ResponseEntity("Neispravno uneti podaci", HttpStatus.BAD_REQUEST);
	        }

	        Restoran restoran = new Restoran();
	        
	        restoran.setNaziv(restoranDto.getNaziv());
	        restoran.setTip_restorana(restoranDto.getTip_Restorana());
	        restoran.setLokacija(restoranDto.getLokacija());
	        
	        
            restoran.setStatus(StatusRestorana.valueOf(restoranDto.getStatus()));
            
            long broj = 4;
            
            Menadzer menadzer;
            menadzer = (Menadzer) menadzerService.findOne(broj);
            restoran.setMenadzer(menadzer);
            
   
            


	        restoranService.save(restoran);

	        return ResponseEntity.ok("Uspesno je dodat restoran!");
	    }
	    
	    //Pretrage Restorana
	    
	    @GetMapping("/api/restorani/naziv/{naziv}")
	    public ResponseEntity<Restoran> getByNaziv(@PathVariable String naziv) 
	    {
	        Restoran restoran = restoranService.getByNaziv(naziv);
	        return ResponseEntity.ok(restoran);
	    }
	    
	    @GetMapping("/api/restorani/lokacija/{lokacija}")
	    public ResponseEntity <Restoran> getByLokacija (@PathVariable String lokacija)
	    {
	    	Restoran restoran = restoranService.getByLokacija(lokacija);
	    	return ResponseEntity.ok(restoran);
	    }
	    
	  
	    

}
