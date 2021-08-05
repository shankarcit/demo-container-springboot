package com.shankar.container.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shankar.container.model.Employee;

@Mapper
public interface EmployeeMapper {
	
	Employee get(@Param("id") int id);
	int insert(@Param("employee") Employee employee);
	int update(@Param("employee") Employee employee);
	int delete(@Param("id") int id);

}
