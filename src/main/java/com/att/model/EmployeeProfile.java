package com.att.model;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeProfile {
	
	private String fName = null;
	private String lname = null;
	private int age = 0;

	public EmployeeProfile() {}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
