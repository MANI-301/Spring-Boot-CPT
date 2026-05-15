package com.app;

public class Vodafone implements Sim {
	
	public Vodafone() {
		System.out.println("Default of Vodafone");
	}

	@Override
	public void calling() {
			System.out.println("Calling using Vodafone Sim");		
	}

	@Override
	public void data() {
			System.out.println("Browsing using Vodafone Sim");		
	}

}
