package com.att.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.att.data.LaptopDAO;
import com.att.data.EmployeeDAO;
import com.att.model.Employee;
import com.att.model.EmployeeProfile;
import com.att.model.Laptop;


public class Helper {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Helper.class);
	
	public static void main(String[] args) {
		
		try {

			LOGGER.info("Start Helper main()");
	        
			EmployeeProfile employeeProfile = new EmployeeProfile();
			employeeProfile.setfName("Mark");
			employeeProfile.setLname("Beveridge");
			employeeProfile.setAge(65);
			
			Laptop laptop = new Laptop();
			laptop.setLid(101);
			laptop.setLname("Dell");
			
			
	        //create Employee object
			Employee employee = new Employee();
			employee.setEmployeeProfile(employeeProfile);
			employee.setJobTitleName("Developer");
			employee.setAttuid("mb0914");  
			employee.setLaptop(laptop);
			
			LOGGER.info("create laptop");
			LaptopDAO laptopDAO = new LaptopDAO();
			laptopDAO.createLaptop(laptop);
	        
			LOGGER.info("create employee");
			EmployeeDAO employeeDAO = new EmployeeDAO();
			
			employeeDAO.createEmployee(employee);
		
					
			String attuid = "mb0914";
					
			Employee newHire = new Employee();
			newHire = (employeeDAO.getEmployee(attuid));
			LOGGER.debug(newHire.getAttuid() + " is retreived");
	        
			LOGGER.debug("Exit main()");
			
		} catch(Exception e) {
			LOGGER.info(e.getLocalizedMessage());
		}
		

		
	}

}
