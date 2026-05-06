package com.app;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Default of Airtel");
	}

	@Override
	public void calling() {
			System.out.println("Calling using Airtel Sim");		
	}

	@Override
	public void data() {
			System.out.println("Browsing using Airtel Sim");		
	}

	
}
