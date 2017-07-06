package com.suresh.tr.hr.repository;

import java.util.*;
import com.suresh.tr.hr.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	/* (non-Javadoc)
	 * @see com.suresh.tr.hr.repository.EmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Suresh");
		employee.setLocation("Boralla");
		employees.add(employee);
		return employees;
	}
}
