package com.epam.alltogether;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class TestMathProvider {
	
	private MathProvider underTest;
	private Sum calcMock;
	
	@Before
	public void setUp(){
		underTest = new MathProvider();
		calcMock = EasyMock.createMock(Sum.class);
		underTest.setCalc(calcMock);
	}
	
	@Test
	public void testSumReturnsSumOfNumbers(){
		//GIVEN
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		EasyMock.expect(calcMock.calculate(0, 1)).andReturn(1);
		EasyMock.expect(calcMock.calculate(1, 2)).andReturn(3);
		EasyMock.expect(calcMock.calculate(3, 3)).andReturn(6);
		EasyMock.expect(calcMock.calculate(6, 4)).andReturn(10);
		EasyMock.replay(calcMock);
		//WHEN
		String result = underTest.sum(numbers);
		//THEN
		EasyMock.verify(calcMock);
		assertEquals("[10]",result);
	}
}
