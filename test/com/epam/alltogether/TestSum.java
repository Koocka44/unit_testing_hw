package com.epam.alltogether;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSum {
	
	private Sum underTest;
	
	@Before
	public void setUp(){
		underTest = new Sum();
	}
	
	@Test
	public void testSumShouldReturnSumOfNumbers(){
		//GIVEN
		Integer a = 2;
		Integer b = 3;
		Integer expectedResult = 5;
		//WHEN
		Integer result = underTest.doCalcualte(a, b);
		//THEN
		assertEquals(expectedResult,result);
	}
}
