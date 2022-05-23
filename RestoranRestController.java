package com.example.Web_Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.service.KorisniciService;
import com.example.Web_Projekat.service.RestoranService;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.Web_Projekat.entity.Korisnik;
import com.example.Web_Projekat.entity.Restoran;
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
	
	
     @GetMapping("/api/restorani")
    public ResponseEntity<List<Restoran>> getRestorani() 
    {
        List<Restoran> restorani = restoranService.findAll();
        
        return ResponseEntity.ok(restorani); 
    }
	 

	  /*  @GetMapping("/api/restorani")
	       public List <Restoran> getRestorani()
	       {
	    	List <Restoran> listaRestorana = restoranService.findAll();
			return listaRestorana;
	       }*/
	    
	    
		/* @GetMapping("/api/restoranic")
		    public ResponseEntity<List<RestoranDto>> getRestorani(HttpSession session) 
		 {
		        List<Restoran> restorani = restoranService.findAll();

		        List<RestoranDto> dtos = new ArrayList<>();
		        for (Restoran restoran : restorani) {
		            
		        	RestoranDto dto = new RestoranDto(restoran.getNaziv(), restoran.getTip_Restorana(), restoran.getLokacija(), null, null);
		            dtos.add(dto);
		        }
		        return ResponseEntity.ok(dtos);

		        
		    }*/
	    
	    
	
	    
	    //Kreiranje Novog Restorana
	    @PostMapping("/api/restoran/create")
	    public ResponseEntity<String> createRestoran(@RequestBody RestoranDto restoranDto) {

	        if (restoranDto.getNaziv().isEmpty()) //|| restoranDto.getTip_Restorana().isEmpty()) 
	        {
	            return new ResponseEntity("Neispravno uneti podaci", HttpStatus.BAD_REQUEST);
	        }

	        Restoran restoran = new Restoran();
	        
	        restoran.setNaziv(restoranDto.getNaziv());
	        
	        restoran.setTip_Restorana(restoranDto.getTip_Restorana());
	        
	        
	        restoran.setLokacija(restoranDto.getLokacija());
	        

	        restoranService.save(restoran);

	        return ResponseEntity.ok("Uspesno je dodat restoran!");
	    }
	    

}

