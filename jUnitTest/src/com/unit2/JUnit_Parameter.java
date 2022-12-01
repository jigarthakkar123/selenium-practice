package com.unit2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.google.common.reflect.Parameter;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class JUnit_Parameter {

	Addition a1=new Addition();
	int a,b,c;
	@Before
	public void before()
	{
		a1=new Addition();
	}
	
	public JUnit_Parameter(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{12,23,36}});
	}
	
	@Test
	public void test()
	{
		System.out.println("My Answer Is "+c);
		Assert.assertEquals(c,a1.add(a, b));
	}
}
