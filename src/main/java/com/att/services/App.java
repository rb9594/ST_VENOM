package com.att.services;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOGGER.trace("Trace your class");
    	
    	LOGGER.debug("Debug your class");
    	
    	LOGGER.info("Info your class");
    	
    	LOGGER.warn("Warn your class");
    	
    	LOGGER.error("Error your class");
    	

    }
}
