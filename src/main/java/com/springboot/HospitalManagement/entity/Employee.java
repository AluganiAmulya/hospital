package com.springboot.HospitalManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Records")
public class Employee {
	@Id
	@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="name")
	private String name;

	@Column(name="salary")
	private int salary;

	@Column(name="specialist")
	private String specialist;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	}


