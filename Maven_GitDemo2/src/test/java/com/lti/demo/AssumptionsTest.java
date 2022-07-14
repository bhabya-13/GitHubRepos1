package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
	
	   int number1;
	    
	    @Test
	    void testOnDev()
	    {
	        System.setProperty("ENV", "DEV");
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
	        System.out.println(" continue execution");
	        number1=100;
	    }

	    @Test
	    void testOnProd()
	    {
	        System.setProperty("ENV", "PROD");
	        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),AssumptionsTest::message);
	        System.out.println(" don't continue execution");
	    }

	    private static String message () {
	        return "TEST Execution Failed :: ";
	    }

	
	}


