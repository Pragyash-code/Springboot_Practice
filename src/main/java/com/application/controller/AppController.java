package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
