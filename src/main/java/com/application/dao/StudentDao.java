package com.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.entities.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	
}
