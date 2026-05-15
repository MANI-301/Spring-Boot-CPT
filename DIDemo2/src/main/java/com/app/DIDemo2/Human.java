package com.app.DIDemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	@Autowired
	private Heart heart;
	
	public Human() {
	
	}
   
	@Autowired
	public Human(Heart heart) {
		super();
		System.out.println("Parameter Constructor of Human");
		
		this.heart = heart;
	}
	@Autowired
	public void setHeart(Heart heart) {
		System.out.println("In Setter Of Heart");
		this.heart = heart;
	}
	
	public void pumping() {
		
		if(heart==null) {
		System.out.println("Yor are Dead");
		}
		else {
			heart.pump();
		}
	}
}
