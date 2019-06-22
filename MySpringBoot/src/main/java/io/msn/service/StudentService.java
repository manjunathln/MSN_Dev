package io.msn.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.msn.model.Student;

@RestController
public class StudentService {

	List<Student> stdinfo= new ArrayList(Arrays.asList(
		new Student(1,"manju","1"),new Student(2,"manju","2")
		
	));
	
	
	@RequestMapping("/info")
	public List<Student> getName() {
		return stdinfo;
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/add")
	public String addStudent(@RequestBody Student st) {
		stdinfo.add(st);
		return "Added";
	}
	

}
