package com.yskill.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yskill.dto.AuthorDTO;
import com.yskill.entity.Author;
import com.yskill.exception.AuthorException;
import com.yskill.repository.AuthorRepository;

@Service
public class AuthorServiceImpl  implements AuthorService{

	@Autowired
	private AuthorRepository repository;
	
	@Override
	public List<AuthorDTO> getAllAuthors() {
		Iterable<Author> authors=repository.findAll();
		List<AuthorDTO> authorsDTO=new ArrayList<AuthorDTO>();
		authors.forEach((author)->{
			authorsDTO.add(this.getAuthorDTO(author));
			
		});
		return authorsDTO;
	}

	@Override
	public AuthorDTO getAuthor(int id) throws AuthorException {
		Optional<Author> optionalAuthor=repository.findById(id);
		Author a=optionalAuthor.orElseThrow(()->new AuthorException("Author id "+id+" does not exists.."));
		
		return this.getAuthorDTO(a);
	}

	@Override
	public AuthorDTO addAuthor(AuthorDTO authorDTO) {
		Author a=this.getAuthor(authorDTO);
		a=repository.save(a);
		return this.getAuthorDTO(a);
	}

	@Override
	public AuthorDTO updateAuthorDetails(int id, AuthorDTO authorDTO) throws AuthorException {
		Optional<Author> optionalAuthor=repository.findById(id);
		Author a=optionalAuthor.orElseThrow(()->new AuthorException("Author id "+id+" does not exists.."));
		a.setDateOfBirth(authorDTO.getDateOfBirth());
		a.setEmail(authorDTO.getEmail());
		a.setName(authorDTO.getName());
		repository.save(a);
		return this.getAuthorDTO(a);
	}

	@Override
	public String deleteAuthorDetails(int id) throws AuthorException {
		Optional<Author> optionalAuthor=repository.findById(id);
		Author a=optionalAuthor.orElseThrow(()->new AuthorException("Author id "+id+" does not exists.."));
		repository.delete(a);
		return "Author details with id +"+id+"deleted successfully";
	}
	
	public AuthorDTO getAuthorDTO(Author author)
	{
		AuthorDTO authorDTO=new AuthorDTO();
		authorDTO.setId(author.getId());
		authorDTO.setName(author.getName());
		authorDTO.setEmail(author.getEmail());
		authorDTO.setDateOfBirth(author.getDateOfBirth());
		
		return authorDTO;
	}
	public Author getAuthor(AuthorDTO authorDTO)
	{
		Author author=new Author();
		author.setId(authorDTO.getId());
		author.setName(authorDTO.getName());
		author.setEmail(authorDTO.getEmail());
		author.setDateOfBirth(authorDTO.getDateOfBirth());
		
		return author;
	}

}
