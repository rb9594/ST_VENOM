package com.att.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="employee_temp")
public class Employee {

	@Id
	private String attuid = null;
	private String firstName = null;
	private String lastName = null;
	@Column(name="title")
	private String jobTitleName = null;
	
	//skip storing in the database
	@Transient
	private String spi = null;

	public Employee() {}
	
	public String getAttuid() {
		return attuid;
	}

	public void setAttuid(String attuid) {
		this.attuid = attuid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getJobTitleName() {
		return jobTitleName;
	}

	public void setJobTitleName(String jobTitleName) {
		this.jobTitleName = jobTitleName;
	}

	public String getSpi() {
		return spi;
	}

	public void setSpi(String spi) {
		this.spi = spi;
	}

	@Override
	public String toString() {
		return "Employee [attuid=" + attuid + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitleName="
				+ jobTitleName + ", spi=" + spi + "]";
	}
	
	
}
