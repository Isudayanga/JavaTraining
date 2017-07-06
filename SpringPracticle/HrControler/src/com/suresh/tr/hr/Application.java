package com.suresh.tr.hr;

import java.util.List;

import com.suresh.tr.hr.model.Employee;
import com.suresh.tr.hr.service.EmployeeService;
import com.suresh.tr.hr.service.EmployeeServiceImpl;

public class Application {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployees();

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " Live at " + employee.getLocation());
		}
	}
}
