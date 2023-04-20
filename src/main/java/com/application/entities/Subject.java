package com.application.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="subject")
public class Subject {
	
	@Id
	@Column(name="rollNo")
	private int rollNo;
	
	@Column
	public int english;
	
	@Column
	public int hindi;
	
	@Column
	public int science;
	
	@ManyToOne
	public Student student;

}
