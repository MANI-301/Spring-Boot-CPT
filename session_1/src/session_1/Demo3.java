package session_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		int totalSum = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                totalSum += (i * 2);
            }
        }
 
        System.out.println("The total sum is: " + totalSum);
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
        List<Integer> l = Arrays.asList(1,45,23,7,8,9);
        
        Stream<Integer> s1 = l.stream();
        Stream<Integer> s2 = s1.filter(n -> (n%2 == 0));//Intermediate
        Stream<Integer> s3 = s2.map(n -> n*2);//Intermediate
        int sum = s3.reduce(0,(a,b)->a+b);//Terminal
        System.out.println("Sum = "+sum);

        int total = l.stream().filter(n -> (n%2 == 0)).map(n -> n*2).reduce(0,(a,b)->a+b);
    
        System.out.println("total = "+total);

      //Natural order sorting
        System.out.println("Natural Order: ");
        l.stream().sorted().forEach(System.out::println);

        //Customized Sorting order
        System.out.println("Descending Order: ");
        l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 2. Creating a Stream Using Arrays 
        Stream<Integer> stream = Arrays.stream(new Integer[] {1,2,3,4,5});
        
        //3. Creating a Stream Using Stream.of()
        Stream<String> stream1 = Stream.of("A","B","C");
        
        List<String> names = Arrays.asList("Mani","Anaya","balu","tiru");	
        names.stream().filter(n->n.startsWith("A")).map(String::toLowerCase).forEach(System.out::println);
        //Collect()
        List<String> n1 =names.stream().filter(s-> s.length()>2).collect(Collectors.toList());
        System.out.println(n1);
        
        long count = n1.stream().count();
        System.out.println("Count: " + count);
        
        List<String> c= Arrays.asList("Mani","balu","Mayuri","praveen");
        List<String>n2 = c.stream().filter(s -> s.startsWith("m")).map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(n2);
	}
}

