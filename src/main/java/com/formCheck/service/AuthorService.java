package com.formCheck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formCheck.model.Author;
import com.formCheck.repository.AuthorRepository;

@Service("authorService")
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author saveAuthor(Author author){
		return authorRepository.save(author);
	}
	
	public List<Author> findall(){
		return authorRepository.findAll();
	}
	
	public Author findOne(Integer id){
		System.out.print("Id is hello " + id + "/n");
		return  authorRepository.findById(id).orElse(null);
	}
		
}
