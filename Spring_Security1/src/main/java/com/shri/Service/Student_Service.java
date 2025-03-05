package com.shri.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shri.Entity.Student;
import com.shri.Repository.StudentRepository;


@Service
public class Student_Service {
	
	@Autowired
	StudentRepository repository;
	
	public Student save(Student student)
	{
		Student s=new Student();
		s.setName("Shreya");
		s.setLast("Jadhav");
		Student save = repository.save(s);
//		System.out.println(save);
		return save;
	}
	
	public Optional<Student> get_Data(Integer id)
	{
		Optional<Student> byId = repository.findById(id);
		return byId;
	}

}
