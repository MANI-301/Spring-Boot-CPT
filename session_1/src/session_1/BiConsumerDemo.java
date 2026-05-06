package session_1;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> b = (a, c) -> System.out.println(a+c);
		b.accept(10, 20);

		List<Instructor> list = Instructors.getAll();
		//print out name and gender of instructor
		BiConsumer<String, String> biConsumer =(n,g) -> System.out.println("Name: " +n+" Gender: "+g);
		list.forEach((i) -> biConsumer.accept(i.getName(), i.getGender()));

		// print out name and list of courses 
		System.out.println("-----------------------------------------");
		BiConsumer<String, List< String>> biConsumer2 =(n,l) -> System.out.println("Name: " +n+" Gender: "+l);
		list.forEach((i) -> biConsumer2.accept(i.getName(), i.getCourse()));
		
		// print name and Gender who teaches online
		System.out.println("-----------------------------------------");
		list.forEach((i) -> {
			if(i.isOnlineCourse())
				biConsumer.accept(i.getName(), i.getGender());
		});
	}
}
