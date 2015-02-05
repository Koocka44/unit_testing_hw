package com.epam.alltogether;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestNumberFormatter {
	
	private NumberFormatter underTest;
	
	@Before
	public void setUp(){
		underTest = new NumberFormatter();
	}
	
	@Test
	public void testFormatShouldReturnFormattedString(){
		//GIVEN
		Integer numberToFormat = 1;
		//WHEN
		String result = underTest.format(numberToFormat);
		//THEN
		assertEquals("[1]",result);
	}
}
