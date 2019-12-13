package com.practice.test.Junit_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void initializeObject() {
	
		helper= new StringHelper();
	
	}
	
	@Test
	public void testtruncateAInFirst2Positions() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testtruncateAInFirst2Positions2() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_Negative() {
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_Positive() {
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
