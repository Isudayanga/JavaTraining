package com.suresh.tr.hr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.tr.hr.model.Employee;
import com.suresh.tr.hr.service.EmployeeService;
import com.suresh.tr.hr.service.EmployeeServiceImpl;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //create applicatinContext for configuration file
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class); //create 
		List<Employee> employees = employeeService.getAllEmployees();

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " Live at " + employee.getLocation());
		}
	}
}
