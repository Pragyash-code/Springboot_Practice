package com.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDao;
import com.application.entities.Student;
import com.application.service.StudentService;


//created service as a interface and now implementing it here because we want loose coupling
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
//	@Autowired
//	private SubjectDao subjectDao;
	
	@Override
	public List<Student> getStudents() {
		 return studentDao.findAll();
	}
	
	
	@Override
	public Optional<Student> getStudent(int rollNo) {
		return studentDao.findById(rollNo);
	}

	@Override
	public Student addStudent(Student Data) {
		return studentDao.save(Data);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public void deleteStudent(int rollNo) {
		studentDao.deleteById(rollNo);
	}
}
