package com.example.demo;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repo.BookRepository;

/*
 * This project helps to understand SpringDataJpa Module of springBoot 
 * Also helps to understand Methods of CRUDRepository..
 */

@SpringBootApplication
public class SpringDataJpa1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
	}
	
	@Autowired
	BookRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1.SaveAll()/Save()
//		Book b1=new Book("Chava", "Shreyas");
//		Book b2=new Book("Natrang","Om");
//		Book b3=new Book("Java","RJ");
//		repo.saveAll(Arrays.asList(b1,b2,b3));
		
		//2.findById
//		Optional<Book> byId = repo.findById(1);
//		if(byId.isPresent())
//		{
//			System.err.println(byId);
//		}
//		else
//		{
//			System.err.println("No Records Found..");
//		}
		
		//3.findAllById()
//		Iterable<Book> allById = repo.findAllById(Arrays.asList(1,2,3));
//		for(Book bb:allById)
//		{
//			System.err.println(bb);
//		}
		
		//4.count()
//		long count = repo.count();
//		System.err.println("No Of Records is:"+count);
		
		//5.existsById
//		boolean existsById = repo.existsById(1);
//		if(existsById==true)
//		{
//			System.err.println("Record present in Database");
//		}
//		else
//		{
//			System.err.println("Record does not present in DB...");
//		}
		
		//6.deleteById()
//		repo.deleteById(3);
//		System.err.println("Successfully Deleted..");
		
		repo.deleteAllById(Arrays.asList(1,2));
		
		
	}

}
