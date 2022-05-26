package com.example.Web_Projekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Web_Projekat.service.ArtikalService;
import com.example.Web_Projekat.service.RestoranService;

import java.util.List;

import com.example.Web_Projekat.entity.Artikal;
import com.example.Web_Projekat.entity.Restoran;
import com.example.Web_Projekat.entity.TipHrane;
import com.example.Web_Projekat.entitydto.ArtikalDto;

@RestController
public class ArtikalController 
{
   @Autowired
   private ArtikalService artikalService;
   
   @Autowired
   private RestoranService restoranService;
   
   @GetMapping("/api/artikli")
   public List<Artikal> getArtikli(){
       List<Artikal> artikli = artikalService.findAll();

       return artikli;
   }

   @GetMapping("/api/artikli/{id}")
   public Artikal getArtikal(@PathVariable(name = "id") Long id){
       Artikal artikal = artikalService.findOne(id);
       return artikal;
   }
   

   @PostMapping("/api/artikal/create")
   public String createArtikal(@RequestBody ArtikalDto artikalDto) {
       Artikal artikal = new Artikal();
       
 
       
       artikal.setNaziv(artikalDto.getNaziv());
       artikal.setTip_hrane(TipHrane.valueOf(artikalDto.getTip_hrane()));
       artikal.setOpis(artikalDto.getOpis());
       artikal.setCena(artikalDto.getCena());
       artikal.setKolicina(artikalDto.getKolicina());
       
       Restoran restoran;
    
       //restoran = restoranService.findOne(broj);
        restoran = restoranService.findOne(artikalDto.getRestoran_ID());
       artikal.setRestoran(restoran);

       this.artikalService.save(artikal);
       return "Uspesno sacuvan artikal!";
   }
   
   //Izmena informacija o artiklu
   @PutMapping("/api/artikal/edit")
   public String editArtikal(@RequestBody Artikal artikal) {
       Artikal editArtikal = artikalService.findOne(artikal.getId());
       
       editArtikal.setNaziv(artikal.getNaziv());
       editArtikal.setTip_hrane(artikal.getTip_hrane());
       editArtikal.setKolicina(artikal.getKolicina());
       editArtikal.setOpis(artikal.getOpis());
       editArtikal.setCena(artikal.getCena());
       
    
       this.artikalService.save(editArtikal);
       return "Artikal je uspesno izmenjen!";
   }
   
   //Brisanje artikla
   @DeleteMapping("/api/artikal/delete/{id}")
   public String deleteArtikal(@PathVariable(name = "id") Long id) {
	   
	   Artikal artikal = artikalService.findOne(id);
       this.artikalService.deleteArtikal(artikal);
       return "Artikal je uspesno obrisan!";
   }
   
   
   

}
