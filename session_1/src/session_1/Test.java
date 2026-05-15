package session_1;

public class Test {
	public static void main(String[] args) {
		
		HelloWorldInterface h = new HelloWorldInterface() {
			
			public void sayHello() {
				System.out.println("Hello Java");
			}
			
		};
		
		h.sayHello();
	}

}
