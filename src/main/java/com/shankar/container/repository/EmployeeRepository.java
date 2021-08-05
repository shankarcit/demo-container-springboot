package com.shankar.container.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shankar.container.mapper.EmployeeMapper;
import com.shankar.container.model.Employee;

@Repository
public class EmployeeRepository{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public Employee get(int id) {
		return employeeMapper.get(id);
	}
	
	public int insert(Employee employee) {
		return employeeMapper.insert(employee);
	}
	
	public int update(Employee employee) {
		return employeeMapper.update(employee);
	}	
	
	public int delete(int id) {
		return employeeMapper.delete(id);
	}
	

}
