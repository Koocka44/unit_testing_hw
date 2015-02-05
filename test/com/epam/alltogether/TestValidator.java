package com.epam.alltogether;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestValidator {
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidateNotNullShouldThrowExceptionWhenNullPassed(){
		//GIVEN
		Object input = null;
		//WHEN
		Validator.validateNotNull(input);
		//THEN
	}
	
	@Test
	public void testValidateNotNullShouldNotThrowExceptionWhenNotNullPassed(){
		//GIVEN
		Object input = new Object();
		//WHEN
		try {
			Validator.validateNotNull(input);
		} catch(Exception ex){
		//THEN
			fail("Exception should not be thrown!");
		}
	}
}
