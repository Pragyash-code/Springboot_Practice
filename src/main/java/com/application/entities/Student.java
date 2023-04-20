package com.application.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
	
	@Id
	@Column(name = "rollNo", length = 10)
	private int rollNo;
	
	@Column(name = "firstName", length = 50)
	private String firstName;
	
	@Column(name = "lastName", length = 50)
	private String lastName;

	@Column(name = "standard", length = 10)
	private int standard;

	@Column(name = "school", length = 50)
	private String school;

	@Column(name = "age", length = 50)
	private int age;

	@Column(name = "address", length = 50)
	private String address;

	@Column(name = "gender", length = 50)
	private String gender;

	
}
