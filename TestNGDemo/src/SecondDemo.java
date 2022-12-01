import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class SecondDemo {

	@Test(priority = 2)
	public void test()
	{
		System.out.println("This is test....");
	}
	@Test(priority = 1)
	public void Aest()
	{
		System.out.println("This is Aest....");
	}
	@Test(priority = 0)
	public void Zest()
	{
		System.out.println("This is Zest....");
	}
	@Test(priority = 3)
	public void Rest()
	{
		System.out.println("This is Rest....");
	}
}
