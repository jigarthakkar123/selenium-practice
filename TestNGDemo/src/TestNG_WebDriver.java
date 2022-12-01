import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_WebDriver {

	WebDriver driver=null;
	
	@BeforeTest
	public void beforetest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Jigar\\jigar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	@Test(priority = 0)
	public void setUserName() throws Exception
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void setPassword() throws Exception
	{
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void clickLogin() throws Exception
	{
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void clickSideMenu() throws Exception
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void logout() throws Exception
	{
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
