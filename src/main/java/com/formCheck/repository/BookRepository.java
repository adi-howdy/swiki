package com.formCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formCheck.model.Book;



public interface BookRepository extends JpaRepository<Book, Integer>{
	
}
