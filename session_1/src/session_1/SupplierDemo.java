package session_1;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Integer> s = () ->(int) (Math.random()*1000);
		System.out.println(s.get());
	}

}
