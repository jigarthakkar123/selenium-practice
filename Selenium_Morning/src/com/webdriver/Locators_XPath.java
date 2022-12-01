package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_XPath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
