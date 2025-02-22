package com.shri.Service;

import java.util.ArrayList;

import com.shri.Entity.Student;

public interface Service {
	public abstract ArrayList<Student> getStudent();
	
	public ArrayList<Student> FindById(Integer id);
	
	public ArrayList<Student> findByName(String name);

}
