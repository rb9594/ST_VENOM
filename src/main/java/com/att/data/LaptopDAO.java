package com.att.data;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.att.model.Laptop;


public class LaptopDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(LaptopDAO.class);
	
	
		public void createLaptop(Laptop laptop) {
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        
			session.beginTransaction();
	        
			LOGGER.debug("Begin Transaction");

	        //session.saveOrUpdate("com.att.model.Employee", employee);
	        session.saveOrUpdate(laptop);
	        
	        LOGGER.debug("Performed SaveOrUpdate");
	        //session.save(laptop);
	        
	        session.getTransaction().commit();
	        
	        LOGGER.debug("Committing");
	        
	        //session.close is not needed as hibernate will manage this
	        //session.close();
	        //can't close the factory, if you do all subsequent request will fail
	        //HibernateUtil.shutdown();

		}

	}




