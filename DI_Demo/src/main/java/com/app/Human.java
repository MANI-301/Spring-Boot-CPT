package com.app;


public class Human {

	private Heart heart;
	
	public Human() {
	
	}

	public Human(Heart heart) {
		super();
		System.out.println("Parameter Constructor of Human");
		
		this.heart = heart;
	}

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
