package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider(name="jigar")
	public Object[][] input()
	{
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}

	@Test(dataProvider = "jigar")
	public void f(String username, String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Jigar\\jigar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);

		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Your Test Has Been Passed");
		} else {
			System.out.println("Your Test Has Been Failed");
		}

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);

		driver.close();
	}
}
