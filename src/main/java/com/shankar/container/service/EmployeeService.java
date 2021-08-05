package com.shankar.container.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shankar.container.model.Employee;
import com.shankar.container.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee get(int id) {
		return employeeRepository.get(id);
	}
	
	public int insert(Employee employee) {
		return employeeRepository.insert(employee);
	}
	
	public int update(Employee employee) {
		return employeeRepository.update(employee);
	}	
	
	public int delete(int id) {
		return employeeRepository.delete(id);
	}

}
