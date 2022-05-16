package com.example.Web_Projekat.service;
import com.example.Web_Projekat.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Web_Projekat.repository.RestoranRepository;

import antlr.collections.List;

@Service
public class RestoranService 
{
	@Autowired
	private RestoranRepository restoranRepository;
	
	
	public List  findAll()
	{
		return (List) restoranRepository.findAll();
	}

}



