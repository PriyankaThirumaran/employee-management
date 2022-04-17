package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.domain.Employee;
import com.company.service.AddressServiceImpl;
import com.company.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl addressService;
//	
//	//Fetching the set of address for the 
//	@GetMapping(value="/get/all", produces="application/json")
//	public List<Employee> fetchAllEmployee(){
//		return employeeService.fetchAllEmployee();
//	}
//	
//	//Fetching an Employee details
//	@GetMapping(value="/get/{empId}", produces="application/json")
//	public Employee fetchEmployee(@PathVariable int empId) {
//		return employeeService.fetchEmployee(empId);
//	}
//	
//	//Adding an Employee
//	@PostMapping(value="/add", consumes="application/json")
//	public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
//		String response= employeeService.createEmployee(employee);
//		return ResponseEntity.ok().header("New Employee Added", "Successful").body(response);
//	}
//	
//	//Updating an Employee
//	@PutMapping(value="/update/{empId}", consumes="application/json")
//	@ResponseBody
//	public String updateEmployee(@PathVariable int empId, @RequestBody Employee employee) {
//		return employeeService.updateEmployee(empId, employee);
//	}
//	
//	//Deleting an Employee
//	@DeleteMapping(value="/delete/{empId}")
//	@ResponseBody
//	public String deleteEmployee(@PathVariable int empId) {
//		return employeeService.deleteEmployee(empId);
//	}

}
