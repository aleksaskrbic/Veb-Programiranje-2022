package com.example.Web_Projekat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Web_Projekat.entity.*;

import com.example.Web_Projekat.*;


public interface KomentarRepository extends JpaRepository<Komentar, Long> 
{
	
	 List<Komentar> getByRestoranId(Long restoranId);

}





