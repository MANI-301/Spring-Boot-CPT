package session_1;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		List<Instructor> list  = Instructors.getAll();
		BiPredicate<Boolean, String> p = (o, g) -> 
	    o == true && g.equalsIgnoreCase("male");

	BiConsumer<String, String> b1 = (a, c) -> 
	    System.out.println("Name: " + a + " Gender: " + c);

	list.forEach((i) -> {
	    if (p.test(i.isOnlineCourse(), i.getGender()))
	        b1.accept(i.getName(), i.getGender());
	});

	}
}
