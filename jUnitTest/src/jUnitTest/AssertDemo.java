package jUnitTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AssertDemo {

	@Ignore
	@Test
	public void assertdemo()
	{
		int a=10,b=5;
		Assert.assertTrue(b<a);
	}
	@Ignore
	@Test
	public void assertdemo1()
	{
		String s1=null;
		String s2="Jigar";
		Assert.assertNull(s2);
	}
	@Ignore
	@Test
	public void assertdemo2()
	{
		String s1="jigar";
		String s2="Jigar";
		Assert.assertSame(s1, s2);
		Assert.assertEquals(s1, s2);
	}
	@Test
	public void assertdemo3()
	{
		int a[]= {1,2,3};
		int b[]= {1,2,2};
		Assert.assertArrayEquals(a, b);
	}
}
