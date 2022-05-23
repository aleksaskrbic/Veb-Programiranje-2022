package com.example.Web_Projekat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
public class KorisnikRestController 
{
	@Autowired
    private KorisniciService korisniciService;
	
	@PostMapping("/api/registracija")
    public ResponseEntity<String> registracija(@RequestBody RegistracijaDto registracija_dto) {

       /* if (registerDto.getKorisnickoIme().isEmpty() || registerDto.getLozinka().isEmpty()
                || registerDto.getIme().isEmpty() || registerDto.getPrezime().isEmpty() ||
                registerDto.getPol().isEmpty()) {
            return new ResponseEntity("Neispravno uneti podaci", HttpStatus.BAD_REQUEST);
        }

        if (korisniciService.getByKorisnickoIme(registerDto.getKorisnickoIme()) != null) {
            return new ResponseEntity("Korisnicko ime vec postoji", HttpStatus.BAD_REQUEST);
        }*/

        String uloga;

        if (registracija_dto.getRole() == null) {
            uloga = Uloga.Kupac.toString();
        } else {
            uloga = registracija_dto.getRole();
        }

        Korisnik korisnik = new Korisnik();
        korisnik.setUsername(registracija_dto.getUsername());
        korisnik.setLozinka(registracija_dto.getLozinka());

        korisnik.setIme(registracija_dto.getIme());
        korisnik.setPrezime(registracija_dto.getPrezime());
        korisnik.setPol(registracija_dto.getPol());
        korisnik.setDatum_rodjenja(registracija_dto.getDatum_rodjenja());
        korisnik.setRole(Uloga.valueOf(uloga));

        korisniciService.RegisterKorisnik(korisnik);

        return ResponseEntity.ok("Uspesna registracija!");
    }
	
	//Logovanje Korisnika
	 @PostMapping("/api/login")
	    public ResponseEntity<String> login(@RequestBody LoginDto loginDto, HttpSession session) {

	        if (loginDto.getUsername().isEmpty() || loginDto.getLozinka().isEmpty()) {
	            return new ResponseEntity("Neispravno uneti podaci", HttpStatus.BAD_REQUEST);
	        }

	        Korisnik loggedKorisnik = korisniciService.login(loginDto.getUsername(), loginDto.getLozinka());

	        if (loggedKorisnik == null) {
	            return new ResponseEntity<>("Korisnik ne postoji!", HttpStatus.NOT_FOUND);
	        }

	        session.setAttribute("korisnik", loggedKorisnik);
	        return ResponseEntity.ok("Uspesno logovanje!");
	    }
	 
	 //Izmena Korisnika
	 @PutMapping("/api/korisnik/edit")
	    public String editKorisnik(@RequestBody Korisnik korisnik) 
	    {
	        Korisnik editKorisnik = korisniciService.getByUsername(korisnik.getUsername());
	        
	        editKorisnik.setIme(korisnik.getIme());
	        editKorisnik.setPrezime(korisnik.getPrezime());
	        editKorisnik.setDatum_rodjenja(korisnik.getDatum_rodjenja());
	        editKorisnik.setLozinka(korisnik.getLozinka());
	        editKorisnik.setPol(korisnik.getPol());
	        this.korisniciService.save(editKorisnik);
	        return "Kreirane izmene. Korisnik je sacuvan!";
	     }
	
	
	
	 //Prikaz Svih Korisnika
	 @GetMapping("/api/korisnici")
	    public ResponseEntity<List<KorisnikDto>> getKorisnici(HttpSession session) 
	 {
	        List<Korisnik> korisnici = korisniciService.findAll();

	        Korisnik loggedKorisnik = (Korisnik) session.getAttribute("korisnik");
	        if (loggedKorisnik == null) {
	            System.out.println("Nema sesije");
	        }
	        
	        List<KorisnikDto> dtos = new ArrayList<>();
	        for (Korisnik korisnik : korisnici) {
	            KorisnikDto dto = new KorisnikDto(korisnik.getUsername(), korisnik.getLozinka(),
	                    korisnik.getIme(), korisnik.getPrezime(), korisnik.getPol(),
	                    korisnik.getDatum_rodjenja().toString(), korisnik.getRole());
	            dtos.add(dto);
	        }
	        return ResponseEntity.ok(dtos);

	        
	    }
	 
	 //Prikaz Jednog Korisnika
	 @GetMapping("/api/korisnici/{id}")
	    public Korisnik getKorisnik(@PathVariable(name = "id") Long id, HttpSession session) {
	        Korisnik korisnik = (Korisnik) session.getAttribute("korisnik");
	        session.invalidate();
	        return korisniciService.findOne(id);
	    }

	 
	
	 

}
