package com.suresh.tr.hr.service;

import java.util.List;

import com.suresh.tr.hr.model.Employee;
import com.suresh.tr.hr.repository.EmployeeRepository;
import com.suresh.tr.hr.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository; // = new HibernateEmployeeRepositoryImpl();

	public EmployeeServiceImpl(){
		System.out.println("Default Constatctor");
	}	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Constuctor");
		this.employeeRepository = employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter");
		this.employeeRepository = employeeRepository;
	}

	/* (non-Javadoc)
	 * @see com.suresh.tr.hr.service.EmployeeService#getAllEmployee()
	 */
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}

}
