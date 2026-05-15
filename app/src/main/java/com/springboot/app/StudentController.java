package com.springboot.app;

import java.util.ArrayList;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Student;

@RestController
public class StudentController {
	
	  @GetMapping("/student")
		public Student getStudent() {
			return new Student("mani","parag");
		}
	  @GetMapping("/students")
	  public  List<Student> getStudents(){
		  List<Student> students = new ArrayList<Student>();
		  students.add(new Student("mani","chandiran"));
		  students.add(new Student("praveen","raj"));
		  students.add(new Student("joseph","vijay"));
		  students.add(new Student("ms","dhoni"));
		return students;
	  }
	  

	  @GetMapping("/student/{firstName}/{lastName}")

		public Student studentPathvariable(@PathVariable("firstName") String firstName,
		@PathVariable("lastName") String lastName){
			return new Student(firstName,lastName);
		}
	  
	  @GetMapping("/student/query")
		public Student studentQueryParams(@RequestParam(name="firstName") String firstName,
				@RequestParam(name="lastName") String lastName) {
		  
			return new Student(firstName,lastName);
		}
	}


