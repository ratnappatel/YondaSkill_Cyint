package com.yskill.dto;

import java.util.Date;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

public class AuthorDTO {
	
	private int id;
	
	@NotNull(message = "Author Name must not be blank")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "Author name can only contain alphabets")
	private String name;
	
	@Email(message = "Entered Email id is incorrect")
	@NotNull(message = "Email id can not be empty")
	private String email;
	
	@PastOrPresent(message = "Date of Birth is Invalid")
	private Date dateOfBirth;
	public AuthorDTO() {
	}
	public AuthorDTO(int id, String name, String email, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
