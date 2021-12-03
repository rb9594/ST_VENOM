package com.att.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="employee_temp")

public class Employee {

	@Id
	private String attuid = null;
	private EmployeeProfile employeeProfile = null;
	@Column(name="title")
	private String jobTitleName = null;
	
	//skip storing in the database
	@Transient
	private String spi = null;

	@OneToOne
	private Laptop laptop = null;
	
	public Employee() {}
	
	public String getAttuid() {
		return attuid;
	}

	public void setAttuid(String attuid) {
		this.attuid = attuid;
	}
	
	public EmployeeProfile getEmployeeProfile() {
		return employeeProfile;
	}

	public void setEmployeeProfile(EmployeeProfile employeeProfile) {
		this.employeeProfile = employeeProfile;
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
	
	

	public Laptop  getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [attuid=" + attuid + ", first name=" + employeeProfile.getfName() + ", last name=" + employeeProfile.getLname() + ", age=" + employeeProfile.getAge() + ", jobTitleName="
				+ jobTitleName + ", spi=" + spi + "]";
	}
	
	
}
