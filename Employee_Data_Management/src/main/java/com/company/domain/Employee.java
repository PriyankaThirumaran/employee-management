package com.company.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable{
	
	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "location")
	private String location;
	@Column(name = "addresses")
	@OneToMany(targetEntity = Address.class, mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<>();

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
		
		for(Address address : addresses) {
			address.setEmployee(this);
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", location=" + location + ", addresses=" + addresses + "]";
	}

}
