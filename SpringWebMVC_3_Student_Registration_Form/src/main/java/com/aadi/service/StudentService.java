package com.aadi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadi.binding.Student;
import com.aadi.entity.StudentEntity;
import com.aadi.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public List<StudentEntity> getAllStudents() {
		List<StudentEntity> students = repository.findAll();

		return students;

	}

	public void save(Student student) {
		StudentEntity entity = new StudentEntity();

		entity.setTimings(Arrays.toString(student.getTimings()));

		BeanUtils.copyProperties(student, entity);
		System.out.println(entity);
		repository.save(entity);
	}
}
