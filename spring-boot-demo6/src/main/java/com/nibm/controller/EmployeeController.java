package com.nibm.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nibm.model.EmployeeEntity;
import com.nibm.model.EmployeeService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/", produces = "application/json")
	public List<EmployeeEntity> getEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping(path="/",consumes="application/json",produces="application/json")
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeEntity employee)
	{
		int id = employeeService.getAllEmployees().size()+1;
		employee.setId(new Long(id));
		employeeService.createOrUpdateEmployee(employee);
		
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(employee.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
