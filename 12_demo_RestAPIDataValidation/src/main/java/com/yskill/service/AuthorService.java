package com.yskill.service;

import java.util.List;

import com.yskill.dto.AuthorDTO;
import com.yskill.exception.AuthorException;

public interface AuthorService {
	
	public List<AuthorDTO> getAllAuthors();
	public AuthorDTO getAuthor(int id)throws AuthorException;
	public AuthorDTO addAuthor(AuthorDTO authorDTO);
	public AuthorDTO updateAuthorDetails(int id,AuthorDTO authorDTO)throws AuthorException;
	public String deleteAuthorDetails(int id) throws AuthorException;
	

}
