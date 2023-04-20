package com.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.entities.Subject;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Integer> {

	
}
