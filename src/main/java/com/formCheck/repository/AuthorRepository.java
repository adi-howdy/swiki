package com.formCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formCheck.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
