package com.springboot.HospitalManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.HospitalManagement.entity.Employee;
import com.springboot.HospitalManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository repo;
public List<Employee> listAll()
{
	return repo.findAll();
	
}
public void saveOrupdate(Employee employees)
{
	repo.save(employees);
}
public Employee getEmployeeById(long id)
{
	return repo.findById(id).get();
}
public Employee get(long id){
	return repo.findById(id).get();
}
public void delete(long id)
{
	repo.deleteById(id);
}
}

