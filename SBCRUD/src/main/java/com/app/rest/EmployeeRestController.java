package com.app.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	
	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}
//	
//	@PutMapping
//	public Employee Update(@RequestBody Employee theEmployee) {
//    	
//	}
	
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
	    Employee e = employeeService.findById(employeeId);
	    System.out.println("e = " + e);
	    
	    if (e == null) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } else {
	        return new ResponseEntity<Employee>(e, HttpStatus.OK);
	    }
	}
	@GetMapping("/employees")
	public List<Employee> findAll(){
        return employeeService.findAll();
	}
	

	
	@DeleteMapping("/employees/{theId}")
	public String deleteEmployee(@PathVariable int theId) {
	    Employee e = employeeService.findById(theId);
	    if (e == null) {
	        return "Employee Id not found " + theId;
	    } else {
	        employeeService.deleteById(theId);
	        return "Deleted Employee Id " + theId;
	    }
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
	    employeeService.save(theEmployee);
	    return theEmployee;
	}

	@GetMapping("/employees/count")
	public String getCount()
	{
	    long l = employeeService.getEmployeeCount();
	    return "Total Employee Count = "+l;
	}
	
	@GetMapping("/names/{name}")
	public List<Employee> findByName(@PathVariable String name)
	{
	    return employeeService.findByFirstName(name);
	}

	@PutMapping("employees/{id}")
	public String updateFirstName(@PathVariable int id,
	        @RequestParam String fname)
	{
	    return employeeService.updateFirstName(id,fname);
	}



	}
	


