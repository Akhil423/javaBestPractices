package com.practice.test.Junit_Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CompareArrayTest {

	@Test
	public void testArraySortAlgo() {
		
		int[] num = {15, 8, 1, 4};
		int[] expected = {1,4, 8, 15};
		
		Arrays.sort(num);
		assertArrayEquals(expected, num);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySortNull() {
		
		int[] num = null;
		
		Arrays.sort(num);
		
	
	}
	
	//timeout in milli seconds
	@Test(timeout=30)
	public void testArraySortPerformance() {
		
		int[] num = {15, 8, 1, 4};
		
		for(int i=0;i<100000;i++) {
			
			num[0]=i;
			Arrays.sort(num);
		}
		
		
	}

}
