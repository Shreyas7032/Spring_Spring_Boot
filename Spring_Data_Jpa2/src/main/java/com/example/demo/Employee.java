package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data


public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Dept;
	private int sal;
	
	
	
	public Employee(String name, String dept, int sal) {
		super();
		this.name = name;
		Dept = dept;
		this.sal = sal;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
