package session_1;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //Looping through all the instructor and print out their values
        Consumer<Instructor> c1 = (c) -> System.out.println(c);
        instructors.forEach(c1);
        //internally calls accept on each instructor from the list
        
        
        System.out.println("-----------------------------------------");
        Consumer<Instructor> c2 = (c)->System.out.println(c.getName());
        instructors.forEach(c2);
        
        
        System.out.println("-----------------------------------------");
        Consumer<Instructor> c3 = (c)-> System.out.println(c.getCourse());
        instructors.forEach(c2.andThen(c3));
        
        System.out.println("-----------------------------------------");
        
        instructors.forEach((c)->{
        	if(c.getYearsOfExp()>10) {
        	 c2.accept(c);
        		}
        });
        
        

        System.out.println("-----------------------------------------");
        instructors.forEach((c)->{
        	if(c.getYearsOfExp()>10 && c.isOnlineCourse()) {
        	 c2.accept(c);
        		}
        });
        }

    }


