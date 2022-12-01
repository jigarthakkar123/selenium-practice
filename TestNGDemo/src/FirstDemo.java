import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {

	@Test
	public void test()
	{
		System.out.println("This is main test....");
	}
	@Test
	public void test1()
	{
		System.out.println("This is fail test....");
		fail();
	}
	@Test
	public void test2()
	{
		System.out.println("This is Skipped test....");
		throw new SkipException("self skipped");
	}
}
