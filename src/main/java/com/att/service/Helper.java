package com.att.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.att.data.EmployeeDAO;
import com.att.model.Employee;
import com.att.services.App;


public class Helper {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("Start Helper main()");
        
        //create Employee object
		Employee employee = new Employee();
		employee.setFirstName("Ryan");
		employee.setLastName("Bohnertss");
		employee.setJobTitleName("Assoc Director");
		employee.setAttuid("rb9594");  
        
		System.out.println("create employeeDAO");
		EmployeeDAO employeeDAO = new EmployeeDAO();
		System.out.println("save employee");
		employeeDAO.create(employee);

        
		System.out.println("Exit Main");
		
	}

}
