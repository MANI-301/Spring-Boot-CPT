package com.example.demo.common;



import org.springframework.stereotype.Component;

import com.example.demo.*;

@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("In default constructor pf tennis coach");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run 5k";
	}
	
	

}