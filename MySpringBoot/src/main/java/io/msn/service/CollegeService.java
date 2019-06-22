package io.msn.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.msn.model.Student;

@RestController
public class CollegeService {

	@Autowired
private StdService stdservice;	
	
	
	@RequestMapping("/college/info")
	public List<Student> getName() {
		return stdservice.getAll();
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/add")
	public String addStudent(@RequestBody Student st) {
		stdservice.addRecord(st);
		return "Added";
	}
	

}
