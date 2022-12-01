package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("rahul12345");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
