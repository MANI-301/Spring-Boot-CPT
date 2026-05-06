package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("customer")
	public Customer getCustomer() {
		return new Customer(1,"mani",2004,"mani");
	}

	@GetMapping("customers")
	public List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"mani",2004,"mani@gmail.com"));
		customers.add(new Customer(2,"girish",2004,"giri@gmail.com"));
		customers.add(new Customer(3,"balu",2004,"balu@gmail.com"));
		customers.add(new Customer(4,"praveen",2004,"praveen@gmail.com"));
		customers.add(new Customer(5,"sankar",2004,"sankar@gmail.com"));
		
		return customers;
	}
	
	@GetMapping("/customer/{cid}/{cname}/{cyob}/{cemail}")
	public Customer customerPathvariable(
			@PathVariable("cid") int cid,
			@PathVariable("cname") String cname,
			@PathVariable("cyob") int cyob,
			@PathVariable("cemail") String cemail){
				return new Customer(cid,cname,cyob,cemail);
			}
	  @GetMapping("/customer/query")
	    public Customer getById(@RequestParam(name="cid") int cid, @RequestParam(name="cname") String cname, @RequestParam(name="cyob") int cyob, @RequestParam(name="cemail") String cemail) {
	    	return new Customer(cid, cname, cyob, cemail);
	    }
}
