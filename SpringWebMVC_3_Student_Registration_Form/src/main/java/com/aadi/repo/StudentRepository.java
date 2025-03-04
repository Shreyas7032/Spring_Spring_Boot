package com.aadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadi.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
