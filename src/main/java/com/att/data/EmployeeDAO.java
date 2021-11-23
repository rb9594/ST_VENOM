package com.att.data;

import com.att.model.Employee;
import org.hibernate.Session;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeDAO {

		private static final Logger logger = LogManager.getLogger(EmployeeDAO.class);
	
		public void create(Employee employee) {
			
			
			logger.debug("create");
			System.out.println("sys create");
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			logger.debug("session built");
			System.out.println("sys session built");
	        session.beginTransaction();
	        

	        logger.debug("saveOrUpdate");
	        //session.saveOrUpdate("com.att.model.Employee", employee);
	        session.saveOrUpdate(employee);
	        
	        //session.save(employee);
	        
	         
	        session.getTransaction().commit();
	        HibernateUtil.shutdown();
	        
	        logger.debug("exit");
			
		}

	}




