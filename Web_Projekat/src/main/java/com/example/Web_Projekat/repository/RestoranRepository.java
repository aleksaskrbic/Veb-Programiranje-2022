package com.example.Web_Projekat.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Web_Projekat.entity.*;

import org.springframework.stereotype.Repository;

import com.example.Web_Projekat.*;

public interface RestoranRepository extends JpaRepository<Restoran,Long> 
{

}



