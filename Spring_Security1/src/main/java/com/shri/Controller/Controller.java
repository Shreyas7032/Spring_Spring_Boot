package com.shri.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shri.Entity.Student;
import com.shri.Service.Student_Service;

@RestController
public class Controller {
	
	@Autowired
	Student_Service service;
	
	@GetMapping("/save")
	public ResponseEntity<Student> save(Student student)
	{
		System.out.println(student);
		Student msg=service.save(student);
		
		return new ResponseEntity<Student>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/get_data/{id}")
	public Optional<Student> get_Data(@PathVariable("id") Integer id)
	{
		Optional<Student> get_Data = service.get_Data(id);
		System.out.println(get_Data);
		return get_Data;
	}

}
