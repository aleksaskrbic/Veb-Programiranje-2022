package com.example.Web_Projekat.service;
import com.example.Web_Projekat.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.repository.ArtikalRepository;
import com.example.Web_Projekat.repository.RestoranRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ArtikalService 
{
   @Autowired
   private ArtikalRepository artikalRepository;
   
   public List<Artikal> findAll()
   {
	   return artikalRepository.findAll();
   }
   
   
   public Artikal findOne(Long id){
       Optional<Artikal> pronadjiArtikal = artikalRepository.findById(id);
       if (pronadjiArtikal.isPresent())
           return pronadjiArtikal.get();

       return null;
   }

   public Artikal save(Artikal artikal)
   {
	   return artikalRepository.save(artikal);
   }
   
   public void deleteArtikal(Artikal artikal) {
       artikalRepository.delete(artikal);
   }
   
   
   
   
}







