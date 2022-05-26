package com.example.Web_Projekat.service;
import com.example.Web_Projekat.entity.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.repository.RestoranRepository;


import java.util.List;
import java.util.Optional;

@Service
public class RestoranService 
{
	@Autowired
	private RestoranRepository restoranRepository;
	
	
	//Lista Svih Restorana
	public List<Restoran> findAll()
	{
		return restoranRepository.findAll();
	}
	
	//Dodavanje novog restorana
	public Restoran save(Restoran restoran)
	{
		return restoranRepository.save(restoran);
	}
	//Trazenje Restorana po ID-Y
	 public Restoran findOne(Long id) {
	        Optional<Restoran> restoran = restoranRepository.findById(id);
	        if (restoran.isPresent())
	            return restoran.get();

	        return null;
	    }
	 
	 
	 
	 public Restoran getByNaziv(String naziv)
	 {
		 return restoranRepository.getByNaziv(naziv);
	 }
	 
	 public Restoran getByLokacija(String lokacija)
	 {
		 return restoranRepository.getByLokacija(lokacija);
	 }
	 
	

}



