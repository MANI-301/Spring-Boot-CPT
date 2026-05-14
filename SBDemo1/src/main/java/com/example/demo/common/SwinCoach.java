package com.example.demo.common;



import org.springframework.stereotype.Component;
@Component
public class SwinCoach implements Coach{
	
	public SwinCoach() {
		System.out.println("In default of swin Coach");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

}
