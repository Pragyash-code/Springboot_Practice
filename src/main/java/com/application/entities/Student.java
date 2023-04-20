package com.application.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student {
	
	@Id
	@Column(name="rollNo")
	private int rollNo;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="standard")
	private String standard;
	
	//mapping subject entity class with student class using oneToMany mapping
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="rollNo", referencedColumnName="rollNo")
	private List<Subject> subjectData;
	
}
