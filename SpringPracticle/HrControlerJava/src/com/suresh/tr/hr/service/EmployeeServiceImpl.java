package com.suresh.tr.hr.service;

import java.util.List;

import com.suresh.tr.hr.model.Employee;
import com.suresh.tr.hr.repository.EmployeeRepository;
import com.suresh.tr.hr.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.suresh.tr.hr.service.EmployeeService#getAllEmployee()
	 */


	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository2) {
		this.employeeRepository = employeeRepository;
		
	}

}
