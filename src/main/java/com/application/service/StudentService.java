package com.application.service;

import java.util.List;
import java.util.Optional;

import com.application.entities.Student;

public interface StudentService {

	public List<Student> getStudents();

	public Optional<Student> getStudent(int rollNo);

	public Student addStudent(Student student);

	public Student updateStudent(Student student);
	
	public void deleteStudent(int rollNo);

}
