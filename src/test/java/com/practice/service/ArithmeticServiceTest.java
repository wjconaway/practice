package com.practice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticServiceTest {
	
	@Test
	public void addPositiveTest() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * So what do you nee to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		String actual = as.add("2", "5");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		Assertions.assertEquals("7.0", actual);
	}
	
	@Test
	public void addPositiveTest_2() {
		/*
		 * AAA: ARRANGE, ACT, ASSERT
		 */
		
		/*
		 * ARRANGE: setup whatever we are testing
		 * 
		 * What are you testing? The add method from the ArithmeticService
		 * 
		 * So what do you nee to arrange then? Instantiate a ArithmeticService object
		 */
		ArithmeticService as = new ArithmeticService();
		
		/*
		 * Act: invoke whatever method we are actually testing (the add method)
		 */
		String actual = as.add("2.5", "5.25");
		
		/*
		 * Assert: assert that the actual condition matches what we would expect
		 */
		Assertions.assertEquals("7.75", actual);
	}

}
