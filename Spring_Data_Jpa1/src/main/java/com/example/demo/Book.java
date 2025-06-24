package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String author) {
		super();
		this.name = name;
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", Author=" + Author + "]";
	}
	
	
	
	
}
