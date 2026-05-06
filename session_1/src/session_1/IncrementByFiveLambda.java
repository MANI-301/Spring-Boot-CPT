package session_1;

public class IncrementByFiveLambda {
	public static void main(String[] args) {
		IncrementByFive i = (a) -> {return (a+5);};
		int sum=i.incByFive(5);
		System.out.println("Sum ="+sum);
		
		System.out.println("Total ="+ i.incByFive(7));
	}

}