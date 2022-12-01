package com.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		Thread.sleep(3000);
		
		WebElement d1=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		d1.sendKeys("08102022");
		Thread.sleep(2000);
		d1.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		d1.sendKeys("0915AM");
		
		Thread.sleep(3000);
		driver.close();
	}
}
