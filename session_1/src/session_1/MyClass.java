package session_1;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyClass {
	
	private String message;
	//private Instructor inst;
	
	public MyClass() {
		System.out.println("No args Constructo called");
	}
	
	public MyClass(String message) {
		super();
		this.message = message;
	}
	
	public static boolean onlinecour(Instructor inst) {
		if(inst.isOnlineCourse())
			return true;
		else
			return false;
					
	}
	
	public void getMessage() {
		System.out.println("Message: "+message);
	}
	
	
	
	public static void main(String[] args) {
		
		//z_3Myclass a = new z_3Myclass();
					//or using class intance
		//reference no- args
		// class:: instance
		Supplier<MyClass> s = MyClass::new;
		MyClass m = s.get();
		
		//reference parameterized constructor
		Function<String, MyClass> f = MyClass::new;
		MyClass m1 = f.apply("Java");
		m1.getMessage();
		
		
		//
		Predicate<Instructor> p = MyClass::onlinecour;
		
		
	}

}
