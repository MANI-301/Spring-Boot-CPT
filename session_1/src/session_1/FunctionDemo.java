package session_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

public static void main(String[] args) {Function<Integer, Double> f1 = (n) -> Math.sqrt(n);
System.out.println("Square root of 64: "+f1.apply(64));

Function<String, String> f2 = (n) -> n.toLowerCase();
System.out.println(f2.apply("PROGRAMMING"));

Function<String, String> concatFunction = (s) -> s.concat(" In Java");
System.out.println(f2.andThen(concatFunction).apply("OOPS"));

System.out.println(f2.compose(concatFunction).apply("Programming"));

//Map Interface - HashMap - Hashtable - 16
//Map of instructors with name and yrsOfExp
//Function which will take List<Instructor> and return a Map<String, Integer>

Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
 Map<String, Integer> map = new HashMap<String, Integer>();
 
 // Iterating through the list and populating the map
 instructors.forEach(instructor -> {
     map.put(instructor.getName(), instructor.getYearsOfExp());
 });
 
 return map;
});

System.out.println(mapFunction.apply(Instructors.getAll()));



System.out.println("----------------------------------------------------------------------");

Predicate<Instructor> p1 = (i)-> i.isOnlineCourse();

Function<List<Instructor>, Map<String, Integer>> mapFunction1 = (i -> {
    Map<String, Integer> m = new HashMap<String, Integer>();
    
    i.forEach(inst -> {
        // Wrap the logic in braces so the 'if' condition applies to the 'put' call
        if (p1.test(inst)) {
            m.put(inst.getName(), inst.getYearsOfExp());
        }
    });
    
    return m;
});
System.out.println(mapFunction1.apply(Instructors.getAll()));


System.out.println("----------------------------------------------------------------------");

Predicate<Instructor> p2 = (i)-> i.getYearsOfExp()>5;

Function<List<Instructor>, Map<String, Integer>> mapFunction3 = (i -> {
    Map<String, Integer> m = new HashMap<String, Integer>();
    
    i.forEach(inst -> {
        // Wrap the logic in braces so the 'if' condition applies to the 'put' call
    	if(p1.and(p2).test(inst)) {
            m.put(inst.getName(), inst.getYearsOfExp());
        }
    });
    
    return m;
});
System.out.println(mapFunction3.apply(Instructors.getAll()));
}
}


