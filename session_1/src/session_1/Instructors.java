package session_1;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll(){
		Instructor instructor1 = new Instructor("Mani",12,"Developer","Male",true,Arrays.asList("JAVA","SpringBoot"));
		Instructor instructor2 = new Instructor("balu",13,"Developer","Male",true,Arrays.asList("Python","Jango"));
		Instructor instructor3 = new Instructor("praveen",2,"Developer","Male",false,Arrays.asList("JS","angular"));
		Instructor instructor4= new Instructor("tiru",2,"Developer","Male",true,Arrays.asList("React","C#"));
		Instructor instructor5 = new Instructor("sankar",2,"Developer","Male",true,Arrays.asList("C","Turbo c"));
	
		List<Instructor> list = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
	    return list;
	}

}
