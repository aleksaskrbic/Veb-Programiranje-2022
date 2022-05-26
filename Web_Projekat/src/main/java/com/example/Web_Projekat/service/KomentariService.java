package com.example.Web_Projekat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.entity.Komentar;
import com.example.Web_Projekat.repository.KomentarRepository;

@Service
public class KomentariService 
{
  @Autowired
  private KomentarRepository komentarRepository;
  
  public List<Komentar> getByRestoranId(Long id)
  {
	  return komentarRepository.getByRestoranId(id);
  }
	
}
