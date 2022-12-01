import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations {

	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("This is before suit");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("This is after suit");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is after test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is after method");
	}
	@Test
	public void test()
	{
		System.out.println("This is test");
	}
}
