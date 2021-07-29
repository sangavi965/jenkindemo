package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestTest {

	@Test
	public void testAdd() {
		Calculator cal=new Calculator();
		int res=cal.add(10, 20);
		assertEquals(30, res);
		
		//fail("Not yet implemented");
	}
	@Test
	public void testpro() {
		Calculator cal=new Calculator();
		int res=cal.prob(2, 3);
		assertEquals(6, res);
		
		//fail("Not yet implemented");
	}
	

}
