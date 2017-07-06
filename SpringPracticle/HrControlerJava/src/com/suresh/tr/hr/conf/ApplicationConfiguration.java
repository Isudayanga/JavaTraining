package com.suresh.tr.hr.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.suresh.tr.hr.repository.EmployeeRepository;
import com.suresh.tr.hr.repository.HibernateEmployeeRepositoryImpl;
import com.suresh.tr.hr.service.EmployeeService;
import com.suresh.tr.hr.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
		/*EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		employeeService.setEmployeeRepository(getEmployeeRepository());
		return employeeService;*/
	}
	
	/*@Bean(name="employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
		return new HibernateEmployeeRepositoryImpl();
	}*/
}
