package session_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpTest {
	
	public static void main(String[] args) {
		List<Employee> e = Arrays.asList(new Employee(4852,"mani",20000.0,"IT","male"),
				new Employee(4856,"balu",20000.0,"IT","male"),
				new Employee(4853,"tiru",40000.0,"HR","male"),
				new Employee(4846,"Praveen",30000.0,"HR","male"),
				new Employee(4860,"mani",70000.0,"Finance","male"),
				new Employee(4867,"priya",60000.0,"HR","female"));
		
		// sort by name
		e.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
       
		// sort by salary ascending
		e.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		// sort by salary descending
		e.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

		System.out.println("-------------------------------");
		
		// Sort by Name (Case Insensitive)
		System.out.println("-------------------");
		e.stream()
		 .sorted(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER))
		 .forEach(System.out::println);

		// Sort by name  converted into lowerCase
		System.out.println("-------------------");
		e.stream().map(a->a.getName().toLowerCase())
		 .sorted()
		 .forEach(System.out::println);

		// based on same name with salary 
		System.out.println("-------------------");
		e.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()).forEach(System.out::println);

		
        System.out.println("--------------------------");
     // Get Employees whose salary > 50000
        List<Employee> l1 = e.stream()
            .filter(s -> s.getSalary() > 50000)
            .collect(Collectors.toList());
        l1.forEach(System.out::println);

        // Get only employee names
        List<String> l2 = e.stream()
            .map(Employee::getName)
            .toList();
        System.out.println(l2);
        
        
        // salary based sorting
        List<Employee> l3 = e.stream()
                .filter(s -> s.getSalary() > 30000)
                .collect(Collectors.toList());
            l3.forEach(System.out::println);
        
            
            System.out.println("-------------------------");
            Set<String> s1 =e.stream().map(Employee::getName).collect(Collectors.toSet());
		    System.out.println(s1);
		 
		    // count
		    long count1 = e.stream().count();
		    
		    //total salary
		    Double d1 =e.stream().map(Employee::getSalary).reduce(0.0,Double::sum);
		    System.out.println(d1);
		    
		    // min salary
		    Employee e1 = e.stream().min(Comparator.comparing(Employee::getSalary)).get();
		    System.out.println("Minimum salary of Employee" +e1);
		    
		    
		  //Group Employees By Department
		    Map<String, List<Employee>> m = e.stream()
		        .collect(Collectors.groupingBy(Employee::getDepartment));
		    System.out.println(m);

		    /*
		    In Java 8 Stream API,
		    groupingBy() is a powerful collector used to group elements
		    based on a key (similar to SQL GROUP BY).

		    Map<K, List<T>> result = 
		        list.stream()
		            .collect(Collectors.groupingBy(classifier));

		        T -> input type
		        K -> key (grouping criteria)
		    */


		    System.out.println("-------------");
		    Map<String, List<String>> m1 = e.stream()
		    .collect(Collectors.groupingBy(Employee :: getDepartment,
		    Collectors.mapping(Employee :: getName, Collectors.toList())));
		    System.out.println(m1);
		    
		    System.out.println("-------------");
		  //Count employee as per department
		    Map<String, Long> m2 = e.stream()
		        .collect(Collectors.groupingBy(Employee::getDepartment,
		        Collectors.counting()));
		    m2.forEach((a,b)->System.out.println(a+" "+b));
		    
		    System.out.println("-------------");
		    //Sum of salaries as per department
		    Map<String, Double> m3 = e.stream()
		    	    .collect(Collectors.groupingBy(
		    	        Employee::getDepartment, 
		    	        Collectors.summingDouble(Employee::getSalary)
		    	    ));

		    	m3.forEach((dept, totalSalary) -> System.out.println(dept + " = " + totalSalary));
		    	
		    	Map<String, Map<String,List<Employee>>> m4 = e.stream()
				    	    .collect(Collectors.groupingBy(
				    	        Employee::getDepartment,Collectors.groupingBy(Employee::getGender))); 
				   
				    	    m4.forEach((a,b)->System.out.println(a+" "+b));
				    	    
				    	    
				    	    System.out.println("-------------------------");
				    	    
				    	    // group +max salary
				   Map<String,Optional<Employee>> m5 = e.stream()
					.collect(Collectors.groupingBy(
					Employee::getDepartment,Collectors
					.maxBy(Comparator.comparing(Employee::getSalary)))); 
				   m5.forEach((a,b)->System.out.println(a+" "+b.get()));
	}

}
