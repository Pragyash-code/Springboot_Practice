package com.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//api to student info based on the roll no
	@GetMapping("/student/{rollNo}")
	public Optional<Student> getStudent(@PathVariable int rollNo ) {
		return studentService.getStudent(rollNo);
		
	}
	
	//to add new student to db
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student Data ) {
		return studentService.addStudent(Data);
		
	}
	
	//to update the info already present in the db
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
		
	}
	
	//to delete the data of the student from the db
	@DeleteMapping("/student/{rollNo}")
	public void deleteStudent(@PathVariable int rollNo) {
		 studentService.deleteStudent(rollNo);
	}
}
