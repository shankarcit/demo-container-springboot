package com.shankar.container.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shankar.container.model.Employee;
import com.shankar.container.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/addEmployee")
	public int insertEmployee(@RequestBody Employee emp) {
		return employeeService.insert(emp);

	}

	@GetMapping(value = "/getEmployee")
	public Employee getEmployee(@RequestParam(value="empId") int empId) { 
		System.out.println(employeeService.get(empId).toString()); 
		return employeeService.get(empId);
	}
	
	
	@GetMapping(value = "/sayHello")
	public String getEmployee() { 
		
		return "Hello(Not from Database)";
	}

	@DeleteMapping("/deleteEmployee")
	public int deleteEmployee(@RequestParam(value="id") int empId) {
		return employeeService.delete(empId);
	}

	@PutMapping(value = "/updateEmployee")
	public int updateEmployee(@RequestBody Employee emp) {
		return employeeService.update(emp);

	}

}
