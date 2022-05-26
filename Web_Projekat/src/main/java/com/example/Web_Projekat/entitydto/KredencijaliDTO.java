package com.example.Web_Projekat.entitydto;

public class KredencijaliDTO 
{
	private String username;
	private String password;

	public KredencijaliDTO()
	{
		super();
	}
	
	public KredencijaliDTO(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}



