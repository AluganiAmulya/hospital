package com.springboot.HospitalManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.HospitalManagement.entity.Employee;
import com.springboot.HospitalManagement.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService services;
		
		@GetMapping("/")
		public Iterable<Employee>getEmployees()
		{
			return services.listAll();
		}
		
		@PostMapping(value = "/save")
		private long saveEmployee(@RequestBody Employee employees)
		{
			services.saveOrupdate(employees);
			return employees.getId();
		}
		@RequestMapping("/employee/{id}")
		private Employee getEmployee(@PathVariable(name="id") int employeeid)
		{
			return services.getEmployeeById(employeeid);
		}
		@PutMapping("//edit{id}")
		private Employee update(@RequestBody Employee employees,@PathVariable int id)
		{
			employees.setId(id);
			services.saveOrupdate(employees);
			return employees;
			
		}
		@DeleteMapping("/delete/{id}")
		private void deleteEmployee(@PathVariable("id")int id)
	{
		services.delete(id);
	}
	}

