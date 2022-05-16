package com.example.Web_Projekat.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Komentar implements Serializable 

{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String Id_kupca;
	@Column
	private int Id_Restorana;
	@Column
	private String Komentar;
	@Column
	private int ocena;
	
	public Komentar()
	{
		super();
	}
	
	public Komentar(long ID,String id_kupca, int id_Restorana, String komentar, int ocena) {
		super();
		id = ID;
		Id_kupca = id_kupca;
		Id_Restorana = id_Restorana;
		Komentar = komentar;
		this.ocena = ocena;
	}

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getId_kupca() {
		return Id_kupca;
	}
	public void setId_kupca(String id_kupca) {
		Id_kupca = id_kupca;
	}
	public int getId_Restorana() {
		return Id_Restorana;
	}
	public void setId_Restorana(int id_Restorana) {
		Id_Restorana = id_Restorana;
	}
	public String getKomentar() {
		return Komentar;
	}
	public void setKomentar(String komentar) {
		Komentar = komentar;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
