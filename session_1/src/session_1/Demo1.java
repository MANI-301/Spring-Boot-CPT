package session_1;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo1  {

    public static void main(String[] args) {
        
        // Fetching the list of instructors
        List<Instructor> list = Instructors.getAll();

        // Using a Lambda expression to print each instructor (commented out in your image)
        // list.forEach((i) -> System.out.println(i));

        // Using a Method Reference to print each instructor
        list.forEach(System.out::println);
        
        List<String> l = Arrays.asList("Java", "SpringBoot", "Microservices");

        // 1. Using Lambda to print uppercase (Commented out in your image)
        // l.forEach(i -> {System.out.println(i.toUpperCase());});

        // 2. Transforming the list and saving it back (Using Streams)
        // Note: .toList() is available in Java 16+. For older versions use .collect(Collectors.toList())
        l = l.stream().map(String::toUpperCase).toList();
        System.out.println(l);

        // 3. One-liner: Transform and print each immediately
        l.stream().map(String::toUpperCase).forEach(System.out::println);
    }
  }


