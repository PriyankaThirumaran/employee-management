package com.infosys.service;

import java.util.List;

import com.infosys.domain.Employee;

public interface EmployeeService {
	
	//Fetching all employee details
	public List<Employee> fetchAllEmployee();
	
	//Fetching an employee
	public Employee fetchEmployee(int empId);
	
	//Adding an employee
	public String createEmployee(Employee employee);
	
	//Updating an employee
	public String updateEmployee(int empId, Employee employee);
	
	//Deleting an employee
	public String deleteEmployee(int empId);

}
