package com.practice.test.Junit_Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickBeforeAndAfter {

	private static final Logger log = LoggerFactory.getLogger(QuickBeforeAndAfter.class);
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class Call");
	}
	
	@Before
	public void setUp() {
		
		log.info("Before Every Test Case");
		//System.out.println("Before Test");
	}
	
	@Test
	public void test() {
		
		log.info("First Test Case");
	}
	
	@Test
	public void test2() {
		
		log.info("Second Test Case");
	}
	
	@After
	public void setUp2() {
		
		log.info("After Every Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("After Class Call");
	}

}