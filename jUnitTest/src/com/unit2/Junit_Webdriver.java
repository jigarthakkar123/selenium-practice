package com.unit2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver {

	WebDriver driver=null;
	@Before
	public void beforeSetUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Jigar\\jigar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		Thread.sleep(2000);
	}
	@Test
	public void logintest() throws Exception
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(3000);
	}
	@After
	public void afterSetup()
	{
		System.out.println("Thanks For Connecting");
		driver.close();
	}
}
