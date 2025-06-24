package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	
	

}
