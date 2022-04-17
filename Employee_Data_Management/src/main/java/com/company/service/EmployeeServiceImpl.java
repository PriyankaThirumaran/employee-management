package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.domain.Employee;
import com.company.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Fetching all employee details
	public List<Employee> fetchAllEmployee() {
		return employeeRepository.fetchAllEmployee();
	}
	
	//Fetching an employee
	public Employee fetchEmployee(int empId) {
		return employeeRepository.fetchEmployee(empId);
	}
		
	//Adding an employee
	public String createEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
		return "Employee with Employee Id "+employee.getEmpId()+ " added sucessfully";
	}
		
	//Updating an employee
	public String updateEmployee(int empId, Employee employee) {
		employeeRepository.updateEmployee(empId, employee.getEmpName(), employee.getLocation());
		return "Employee with Employee Id "+empId+ " updated sucessfully";
	}
		
	//Deleting an employee
	public String deleteEmployee(int empId) {
		int affected_rows = employeeRepository.deleteEmployee(empId);
		if (affected_rows == 0)
			return "Employee with Employee Id "+empId+ " not found";
		else
			return "Employee with Employee Id "+empId+ " deleted sucessfully";
	}
	
}
