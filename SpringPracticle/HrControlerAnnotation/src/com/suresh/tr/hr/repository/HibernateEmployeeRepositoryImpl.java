package com.suresh.tr.hr.repository;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.suresh.tr.hr.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Value("${name}")
	String name;
	@Value("${city}")
	String city;
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setLocation(city);
		employees.add(employee);
		return employees;
	}
}
