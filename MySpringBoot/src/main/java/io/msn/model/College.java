package io.msn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {

	@Id
	int id;
	String name;
	
	public College() {
	}
	
	public College(int id, String name ){
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	
}
