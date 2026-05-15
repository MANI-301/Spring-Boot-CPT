package session_1;

public class HelloWorldTraditional implements HelloWorldInterface {

	public void sayHello() {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		HelloWorldInterface h = new HelloWorldTraditional();
		h.sayHello();
	}
}
