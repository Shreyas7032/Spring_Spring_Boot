package com.shri.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shri.Entity.Student;
import com.shri.Service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/student")
	@ResponseBody
	public void getStudents()
	{
		ArrayList<Student> student = service.getStudent();
		for(Student s:student)
		{
			System.out.println("Id:"+s.getId()+"Name:"+s.getName()+"LastName:"+s.getLast());
		}
	}
	
	
	//http://localhost:8080/byId/1
	@GetMapping("byId/{id}")					//By Using Path Variable
	@ResponseBody
	public ArrayList<Student> FindById(@PathVariable("id") Integer id)
	{	
		ArrayList<Student> s = service.FindById(id);
		return s;
	}
	
	
	
	//http://localhost:8080/byName?name=om						//i.e key value pair
	@GetMapping("/byName")
	@ResponseBody
	public ArrayList<Student> FindByName(@RequestParam("name") String name)
	{
		ArrayList<Student> s = service.findByName(name);
		return s;	
	}
}


