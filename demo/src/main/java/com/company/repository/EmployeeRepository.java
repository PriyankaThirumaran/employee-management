package com.company.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.company.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//Fetching all employee details
	@Query(value = "SELECT * FROM Employee", nativeQuery = true)
	public List<Employee> fetchAllEmployee();
		
	//Fetching an employee
	@Query(value= "SELECT * FROM Employee WHERE emp_id = ?1", nativeQuery = true)         //indexed query parameter
	public Employee fetchEmployee(int empId);
			
	//Adding an employee
	//saveAndFlush(S Entity)
			
	//Updating an employee
	@Modifying                //@Modifying is for telling spring-data-jpa that this query is an update operation and it requires executeUpdate() not executeQuery()
	@Transactional
	@Query(value = "UPDATE Employee SET emp_name = :empName, location = :location WHERE emp_id = :empId") //named query parameter
	public int updateEmployee(@Param("empId") int empId, @Param("empName") String empName, 
			@Param("location") String location);
			
	//Deleting an employee
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Employee WHERE emp_id = ?1", nativeQuery = true)
	public int deleteEmployee(int empId);

		

}
