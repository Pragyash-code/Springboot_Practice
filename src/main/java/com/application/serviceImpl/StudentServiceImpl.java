/**
 * 
 */
package com.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDao;
import com.application.entities.Student;
import com.application.service.StudentService;

/**
 * @author Pragyash
 *
 */
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
	
}