package com.example.demo.common;

public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In default of Cricket Coach");
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practise Bowling for 10mins!!";
	}

}
