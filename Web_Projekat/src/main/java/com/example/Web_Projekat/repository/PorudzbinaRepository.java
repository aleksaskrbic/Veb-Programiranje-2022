package com.example.Web_Projekat.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Web_Projekat.entity.Porudzbina;
import com.example.Web_Projekat.entity.StatusPorudzbine;
import com.example.Web_Projekat.entity.Kupac1;
import com.example.Web_Projekat.entity.PORUDZBINA;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PorudzbinaRepository extends JpaRepository<PORUDZBINA, Long> {
  
	List<PORUDZBINA> getByRestoranId(Long restoranId);

    List<PORUDZBINA> getByKupacId(Long kupacId);

   List<PORUDZBINA> getByStatus(StatusPorudzbine status);

   List<PORUDZBINA> getByDostavljacId(Long dostavljacId);

  

}