package com.shri.Service;

import java.util.ArrayList;
import java.util.Arrays;

import com.shri.Entity.Student;

@org.springframework.stereotype.Service

public class ServiceImpl implements Service {

	@Override
	public ArrayList<Student> getStudent() {
		Student s1=new Student(1, "Shreyas", "Jadhav");
		Student s2=new Student(2, "Tejas", "Jadhav");
		Student s3=new Student(3, "KARTIKET", "Jadhav");
		Student s4=new Student(4, "oM", "Shinde");
		
		ArrayList<Student> students=new ArrayList<>();
		students.addAll(Arrays.asList(s1,s2,s3,s4));
		return students;	
		
	}

	@Override
	public ArrayList<Student> FindById(Integer id) 
	{
		Student s1=new Student(1, "Shreyas", "Jadhav");
		Student s2=new Student(2, "Tejas", "Jadhav");
		Student s3=new Student(3, "KARTIKET", "Jadhav");
		Student s4=new Student(4, "oM", "Shinde");
		
		ArrayList<Student> students=new ArrayList<>();
		students.addAll(Arrays.asList(s1,s2,s3,s4));
		
		ArrayList<Student> s=new ArrayList<>();
		
		for(Student student:students)
		{
			if(id.equals(student.getId()))
			{
				s.add(student);
			}
		}
		return s;
	}

	@Override
	public ArrayList<Student> findByName(String name) {
		
		Student s1=new Student(1, "Shreyas", "Jadhav");
		Student s2=new Student(2, "Tejas", "Jadhav");
		Student s3=new Student(3, "KARTIKET", "Jadhav");
		Student s4=new Student(4, "oM", "Shinde");
		
		ArrayList<Student> students=new ArrayList<>();
		students.addAll(Arrays.asList(s1,s2,s3,s4));
		
		ArrayList<Student> s=new ArrayList<>();
		
		for(Student student:students)
		{
			if(name.equalsIgnoreCase(student.getName()))
			{
				s.add(student);
			}
		}
		return s;
	}

	

}
