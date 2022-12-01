package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS_Attribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("rahul123");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
