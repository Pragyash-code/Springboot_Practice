package com.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.entities.Student;
import com.application.service.StudentService;

@RestController
public class AppController {

	
	//importing service class
	@Autowired
	private StudentService studentService;
	
	//getting all the students list
	@GetMapping("/student")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	
}
