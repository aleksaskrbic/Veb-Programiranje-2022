package com.example.Web_Projekat.controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.entity.Artikal;
import com.example.Web_Projekat.entity.Korisnik;
import com.example.Web_Projekat.entity.Restoran;
import com.example.Web_Projekat.entity.Uloga;
import com.example.Web_Projekat.service.ArtikalService;
import com.example.Web_Projekat.service.KorisniciService;
import com.example.Web_Projekat.service.RestoranService;
import com.example.Web_Projekat.entitydto.LoginDto;
import com.example.Web_Projekat.entitydto.RegistracijaDto;
import com.example.Web_Projekat.entitydto.KorisnikDto;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

@RestController
public class AdminRestController 

{
	
	@Autowired
    private KorisniciService korisniciService;
	
	@Autowired
	private RestoranService restoranService;
	
	 //Prikaz Svih KOrisnika od strane Admina
	 @GetMapping("/api/admin/korisnici")
	    public ResponseEntity<List<KorisnikDto>> getKorisnici(HttpSession session) 
	 {
	        List<Korisnik> korisnici = korisniciService.findAll();

	        Korisnik loggedKorisnik = (Korisnik) session.getAttribute("korisnik");
	      /*  if (loggedKorisnik == null) {
	            System.out.println("Nema sesije");
	        }*/
	        
	        List<KorisnikDto> dtos = new ArrayList<>();
	        for (Korisnik korisnik : korisnici) {
	            KorisnikDto dto = new KorisnikDto(korisnik.getUsername(), korisnik.getLozinka(),
	                    korisnik.getIme(), korisnik.getPrezime(), korisnik.getPol(),
	                    korisnik.getDatum_rodjenja().toString(), korisnik.getRole());
	            dtos.add(dto);
	        }
	        return ResponseEntity.ok(dtos);

	        
	    }
	 //Pretraga korisnika po korisnickom imenu
	 @GetMapping("/api/korisnici/username/{username}")
	 public ResponseEntity<Korisnik> getByNaziv(@PathVariable String username) 
	    {
	        Korisnik korisnik = korisniciService.getByUsername(username);
	        return ResponseEntity.ok(korisnik);
	    }
	 
	 //Pretraga korisnika po imenu
	 
	 @GetMapping("/api/korisnici/ime/{ime}")
	 public ResponseEntity<Korisnik> getByIme(@PathVariable String ime) 
	    {
	        Korisnik korisnik = korisniciService.getByName(ime);
	        return ResponseEntity.ok(korisnik);
	    }
	 
 //Pretraga korisnika po imenu
	 
	 @GetMapping("/api/korisnici/prezime/{prezime}")
	 public ResponseEntity<Korisnik> getByPrezime(@PathVariable String prezime) 
	    {
	        Korisnik korisnik = korisniciService.getByPrezime(prezime);
	        return ResponseEntity.ok(korisnik);
	    }
	 
	 
	 //Brisanje Restorana
	 
	   @DeleteMapping("/api/restoran/delete/{id}")
	   public String deleteArtikal(@PathVariable(name = "id") Long id) 
	   {
           Restoran restoran = restoranService.findOne(id);
           this.restoranService.deleteRestoran(restoran);
   	       return "Restoran je uspesno obrisan!";
	   }
	 
	 


}
