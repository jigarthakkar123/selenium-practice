package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_SelectClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.name("country"));
		
		Select s1=new Select(ele1);
		
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(2000);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		
		for(int i=1;i<=50;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(1000);
			if(i==7)
			{
				break;
			}
		}
		driver.close();
	}
}
