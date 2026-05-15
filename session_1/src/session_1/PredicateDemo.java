package session_1;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		//if number is > 10 return true or false
		
		Predicate<Integer> p = (i) -> i%2==0;
		System.out.println(p.test(11));
		
		// if number is > 10  and number is even no 
		Predicate<Integer> p1 = (i) -> i%2==0;
		System.out.println(p.and(p1).test(11));
		
		// if number is > 10  or number is even no 
		System.out.println(p.or(p1).test(1));
		
		// no>19 && odd no 
		Predicate<Integer> p2 = (i) -> i%2!=0;
		System.out.println(p.and(p1.negate()).test(33));
		
		
		List<Instructor> list = Instructors.getAll();
		// Predicate to check if instructor teaches online
		Predicate<Instructor> p3 = (i) -> i.isOnlineCourse();

		list.forEach((inst) -> {
		    if (p3.test(inst))
		        System.out.println(inst);
		});

		System.out.println("---------------------");

		// Predicate to check for more than 10 years of experience
		Predicate<Instructor> p4 = (i) -> i.getYearsOfExp() > 10;

		list.forEach((i) -> {
		    // Chaining p3 AND p4
		    if (p3.and(p4).test(i))
		        System.out.println(i.getName());
		});

		// BiConsumer print name and courses
		
		BiConsumer<String,List<String>> b1 = (a,b) -> System.out.println("Name: " +a+" Gender: "+b);
	    list.forEach((i)->{
	    	if(p3.and(p4).test(i))
	    		b1.accept(i.getName(), i.getCourse());
	    });
	}
}
