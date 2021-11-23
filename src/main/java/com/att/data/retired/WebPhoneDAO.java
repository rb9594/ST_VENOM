package com.att.data.retired;

import java.sql.*;
import java.util.ArrayList;

import com.att.model.*;

public class WebPhoneDAO {
	

	//private String query = "select first_name, last_name, job_title_name from webphone where dept_name = 'ECOMP PLATFORM AND SYSTEMS' \n"
	//		+ "and management_level_indicator is not null and job_title_name like 'ASSOCIATE%'";
	
	
	String query = "select first_name, last_name, handle, dept_id, dept_name, business_group_id, business_group_name, business_sub_group, business_sub_group_name, business_unit, business_unit_name, vp_org, vp_org_name, job_title_name, cost_center, lvl, supervisor_attuid, consulting_company, management_level_indicator from cenet";

	String query1 = "SELECT EXTRACT(YEAR FROM TIMESTAMP '2021-12-31 13:30:15') - EXTRACT(YEAR FROM ncs_date) as srvc_years, attuid, emp_id, supv_attuid, first_name,  last_name, city, state, work_country,   hire_date, ncs_date, bus_unit_id, bus_unit_desc, dept_id, dept_desc, org_id, org_desc, job_id, job_desc, job_effective_date, pos_id, pos_desc, pos_effective_date, consultant_flag FROM public.cenet where emp_id is not null--where attuid = 'rb9594' order by srvc_years";
	
	//empty constructor
	public WebPhoneDAO() {}
	
	
	public Employee readWebPhone() {
	
		//get connection object 
		DbAccessHelper postgresDb = new DbAccessHelper();
		

		try {
			Statement stmt = postgresDb.connect().createStatement();
		
        	ResultSet rs = stmt.executeQuery(query);
        
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
			Employee employee = new Employee();
			
			while(rs.next()) {
				
				employee.setFirstName(rs.getString("first_name"));
				employee.setLastName(rs.getString("last_name"));
				employee.setJobTitleName(rs.getString("job_title_name"));
				System.out.println(employee.getFirstName() + " " + employee.getLastName() + " =>" + employee.getJobTitleName());
				employeeList.add(employee);
				
			}
			
			return employee;

		
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	
	}
	

}
