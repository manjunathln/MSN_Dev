package io.msn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.msn.model.Student;
import io.msn.repository.StudentCrudRepository;

@Service
public class ClgService {

@Autowired
private StudentCrudRepository stdcrud;
	
	
	public List<Student> getAll(){
		return (List<Student>) stdcrud.findAll();
	}

	public void addRecord(Student st) {
		stdcrud.save(st);
		
	}
	
	
}
