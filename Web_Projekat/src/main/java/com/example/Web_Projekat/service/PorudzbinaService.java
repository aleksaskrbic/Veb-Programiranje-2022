package com.example.Web_Projekat.service;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.repository.PorudzbinaRepository;


import com.example.Web_Projekat.entity.Porudzbina;
import com.example.Web_Projekat.entity.StatusPorudzbine;

@Service
public class PorudzbinaService 
{

	@Autowired
	private PorudzbinaRepository porudzbinaRepository;
	
	//Pronalazenje Porudzbine po ID-Ju Restorana
	public List<Porudzbina> getPorudzbineByRestoran(Long restoranId)
	{
		return porudzbinaRepository.getByRestoranId(restoranId);
	}
	
	//Pronalazenje Jedne POrudzbine
	public Porudzbina findOne(UUID id) {
        Optional<Porudzbina> porudzbina = porudzbinaRepository.findByUuid(id);
        
        if (porudzbina.isPresent())
            return porudzbina.get();

        return null;
       
    }
	
	//Pronalazenje POrudzbine prema kupcu
	public List<Porudzbina> getPorudzbineByKupac(Long kupacId) {
        return porudzbinaRepository.getByKupacId(kupacId);
    }
	
	//Pronalazenje POrudzbine prema status
	public List<Porudzbina> getPorudzbineByStatus(StatusPorudzbine status) {
        return porudzbinaRepository.getByStatus(status);
    }
	
	//Po Dostavljacu
	public List<Porudzbina> getPorudzbineByDostavljac(Long dostavljacId) {
        return porudzbinaRepository.getByDostavljacId(dostavljacId);
    }

    

    public List<Porudzbina> getByArtikalId(Long id) {
        return porudzbinaRepository.getByArtikalId(id);
    }
    
    //Cuvanje Porudzbine
    public Porudzbina savePorudzbina(Porudzbina porudzbina) {
        return this.porudzbinaRepository.save(porudzbina);
    }
	
	
	
	
	
}
