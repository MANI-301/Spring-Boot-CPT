package com.app.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeService  {
	
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
	public long getEmployeeCount();
	List<Employee> findByFirstName(String name);
	public String updateFirstName(int id, String fname);

}
