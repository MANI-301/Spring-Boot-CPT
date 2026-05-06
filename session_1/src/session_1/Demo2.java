package session_1;

import java.util.List;
import java.util.function.Predicate;

public class Demo2 {

//reference to static method
//Class: : staticMethod
public static boolean greaterThanFiveYearOfExperience(Instructor instructor)
{
	if(instructor.getYearsOfExp()>5)
		return true;
		else
		return false;
	}
public static void main(String[] args) {
//Predicate<Instructor> p = (i) -> i.getYears0fExp()>5;
Predicate<Instructor> p = Demo2 :: greaterThanFiveYearOfExperience;
List<Instructor> list = Instructors.getAll();
list. forEach(x -> {if(p.test(x)) {System.out.println(x);}});

}
}
