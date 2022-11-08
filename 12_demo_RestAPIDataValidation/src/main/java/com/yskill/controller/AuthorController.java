package com.yskill.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yskill.dto.AuthorDTO;
import com.yskill.exception.AuthorException;
import com.yskill.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	@GetMapping("/authors")
	public ResponseEntity<List<AuthorDTO>> getAllAuthors()
	{
		List<AuthorDTO> authors=service.getAllAuthors();
		return new ResponseEntity<>(authors,HttpStatus.OK);
	}
	
	@PostMapping("/authors")
	public ResponseEntity<AuthorDTO> addAuthor(@Valid @RequestBody AuthorDTO authorDTO)
	{
		authorDTO=service.addAuthor(authorDTO);
		return new ResponseEntity<>(authorDTO,HttpStatus.OK);
	}
	
	@PutMapping("/authors/{id}")
	public ResponseEntity<Object> updateAuthorDetails(@PathVariable("id")Integer id,@Valid @RequestBody AuthorDTO authorDTO)
	{
		try {
			authorDTO=service.updateAuthorDetails(id, authorDTO);
		} catch (AuthorException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(authorDTO,HttpStatus.OK);
	}
	
	@GetMapping("/authors/{id}")
	public ResponseEntity<Object> getAuthorDetails(@PathVariable Integer id)
	{
		AuthorDTO authorDTO;
		try {
			authorDTO=service.getAuthor(id);
		} catch (AuthorException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(authorDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/authors/{id}")
	public ResponseEntity<Object> deleteAuthorDetails(@PathVariable Integer id)
	{
		String msg="";
		try {
			msg=service.deleteAuthorDetails(id);
		} catch (AuthorException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
