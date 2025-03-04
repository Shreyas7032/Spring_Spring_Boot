package com.aadi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aadi.binding.Student;
import com.aadi.entity.StudentEntity;
import com.aadi.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/allstudents")
	public String getAllStudents(Model model)
	{
		List<StudentEntity> allStudents = service.getAllStudents();
		model.addAttribute("students",allStudents) ;
		
		return "students";
	}

	//localhost:9090
	@GetMapping("/")
	public String loadForm(Model model)
	{
		Student student=new Student();
	
			
		model.addAttribute("student", student);
		
		return "index";//page jsp 
	}
	
	@PostMapping("/save")
	public String saveStudent(Student student,Model model)
	{
		service.save(student);
		
		model.addAttribute("msg", "Student Saved..");
		return "index";
		
	}
	
	
}
