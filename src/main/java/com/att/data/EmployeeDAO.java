package com.att.data;

import com.att.model.Employee;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmployeeDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDAO.class);
	
	
		public void createEmployee(Employee employee) {
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        
			session.beginTransaction();
	        
			LOGGER.debug("Begin Transaction");

	        //session.saveOrUpdate("com.att.model.Employee", employee);
	        session.saveOrUpdate(employee);
	        
	        LOGGER.debug("Performed SaveOrUpdate");
	        //session.save(employee);
	        
	        session.getTransaction().commit();
	        
	        LOGGER.debug("Committing");
	        
	        //session.close is not needed as hibernate will manage this
	        //session.close();
	        //can't close the factory, if you do all subsequent request will fail
	        //HibernateUtil.shutdown();
		}
		
		public Employee getEmployee(String attuid) {
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			LOGGER.debug("Session built");
	        
			session.beginTransaction();
	        
			LOGGER.debug("Begin Transaction");
	         
			Employee employee = (Employee)session.get(Employee.class, attuid);
	       
	        //session.close is not needed as hibernate will manage this
	        //session.close();
	        //can't close the factory, if you do all subsequent request will fail
	        //HibernateUtil.shutdown();
	        
			LOGGER.info("Retrieved employee"); 

	        return employee;
			
		}

	}




