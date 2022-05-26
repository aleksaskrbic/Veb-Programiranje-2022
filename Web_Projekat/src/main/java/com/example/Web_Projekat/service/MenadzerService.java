package com.example.Web_Projekat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.entity.Korisnik;
import com.example.Web_Projekat.entity.Menadzer;
import com.example.Web_Projekat.repository.MenadzerRepository;

@Service
public class MenadzerService 
{
	@Autowired
	private MenadzerRepository menadzerRepository;
	  
	   public Korisnik findOne(Long id) {
	       Optional<Menadzer> menadzer = menadzerRepository.findById(id);
	       if (menadzer.isPresent())
	           return menadzer.get();

	       return null;
	   }

}
