package jUnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllAnotationsDemo {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	@Before
	public void beforeTest()
	{
		System.out.println("Before");
	}
	
	//@Ignore
	@Test
	public void test()
	{
		System.out.println("main test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
}
