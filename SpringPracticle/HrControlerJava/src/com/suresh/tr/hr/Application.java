package com.suresh.tr.hr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.tr.hr.conf.ApplicationConfiguration;
import com.suresh.tr.hr.model.Employee;
import com.suresh.tr.hr.service.EmployeeService;
import com.suresh.tr.hr.service.EmployeeServiceImpl;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class); //create applicatinContext for configuration file
		
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class); //create 
		List<Employee> employees1 = employeeService.getAllEmployees();
		List<Employee> employees2 = employeeService.getAllEmployees();
		System.out.println(employees1.toString());
		System.out.println(employees2.toString());

		for (Employee employee : employees1) {
			System.out.println(employee.getName() + " Live at " + employee.getLocation());
		}
	}
}
