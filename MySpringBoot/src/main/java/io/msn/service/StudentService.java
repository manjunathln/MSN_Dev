package io.msn.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.msn.model.Student;

@RestController
public class StudentService {

	List<Student> stdinfo=Arrays.asList(
		new Student(1,"manju","1"),new Student(2,"manju","2")
		
	);
	
	
	@RequestMapping("/hello")
	public List<Student> getName() {
		return stdinfo;
	}
	
}
