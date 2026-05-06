package session_1;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = (a)->{
			System.out.println(a.length()+" value of a is "+a);};
			c.accept("Java");
			c.accept("Spring Boot");
			
			Consumer<Integer> d = (a)->{
				System.out.println((a+a));
				System.out.println((a*a));
		};
		d.accept(10);
	}

}
