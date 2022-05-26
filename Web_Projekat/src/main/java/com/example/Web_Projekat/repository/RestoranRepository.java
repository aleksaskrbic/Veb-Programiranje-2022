package com.example.Web_Projekat.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Web_Projekat.entity.Restoran;

import org.springframework.stereotype.Repository;

import com.example.Web_Projekat.*;

import java.io.Serializable;
import java.util.List;

@Repository
public interface RestoranRepository extends JpaRepository<Restoran,Long> 
{
     Restoran getByNaziv(String naziv);
     
     
    // Restoran getBytip_restorana(String tip_restorana);
     
     //Restoran getByTip_restorana(String tip_restorana);
     
    // Restoran getBytip_restorana(String tip_restorana);
          
     Restoran getByLokacija(String Lokacija);
     
     
}



