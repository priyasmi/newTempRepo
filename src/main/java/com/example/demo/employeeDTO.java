package com.example.demo;

import java.util.List;

public class employeeDTO {
	
	private String name;
	
	private String department;
	
	private List<employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<employee> employees) {
		this.employees = employees;
	}	
}
