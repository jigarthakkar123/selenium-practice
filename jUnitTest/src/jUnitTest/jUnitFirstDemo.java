package jUnitTest;

import static org.junit.Assert.fail;

import org.junit.Test;

public class jUnitFirstDemo {

	@Test
	public void test()
	{
		System.out.println("this is test");
	}
	@Test
	public void test1()
	{
		System.out.println("this is test1");
		fail();
	}
}
