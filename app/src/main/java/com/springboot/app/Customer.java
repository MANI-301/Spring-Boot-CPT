package com.springboot.app;

import java.time.Year;

public class Customer {
     private int cid;
     private String cname;
     private int cyob;
     private String cemail;
     private int age;
     
	public Customer(int cid, String cname, int cyob, String cemail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cyob = cyob;
		this.cemail = formatEmail(cemail);
		this.age = calculateAge(cyob);
	}
	

	public int calculateAge(int year) {
		int currentyear = Year.now().getValue();
		return currentyear - year;
	}
	

	private String formatEmail(String email) {
        if (email == null || email.isEmpty()) {
            return null;
        }

        
        if (email.contains("@")) {
            return email;
        }

    
        return email + "@gmail.com";
    }
	
	
	
	
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public int getCyob() {
		return cyob;
	}
	
	public String getCemail() {
		return cemail;
	}


	public int getAge() {
		return age;
	}
	
	
	
	
//	public Customer(int cid) {
//		super();
//		this.cid = cid;
//		
//	}
//	public Customer(int cid, String cname) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		
//	}
//	public Customer(int cid, String cname, int cyob) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.cyob = cyob;
//	}
	
	
}
