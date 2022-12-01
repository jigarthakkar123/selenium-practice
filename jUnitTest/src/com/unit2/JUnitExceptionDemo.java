package com.unit2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitExceptionDemo {

	ArthmeticExceptionDemo ae=null;
	
	@Before
	public void before()
	{
		ae=new ArthmeticExceptionDemo();
	}
	
	@Test(expected = ArithmeticException.class)
	public void test()
	{
		ae.division(10, 0);
	}
	
	@After
	public void after()
	{
		
	}
}
