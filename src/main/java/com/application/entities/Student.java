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

@Data
@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "rollNo", length = 10)
	private int rollNo;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "className", length = 50)
	private String className;

	@Column(name = "school", length = 50)
	private String school;

	@Column(name = "age", length = 50)
	private int age;

	@Column(name = "address", length = 50)
	private String address;

	@Column(name = "gender", length = 50)
	private String gender;
	
//	mapping subject entity class with student class using oneToMany mapping
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="rollNo", referencedColumnName="rollNo")
//	private List<Subject> subjectData;
	
}
