package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("file:///C:\\Users\\LearnVern\\eclipse-workspace\\Selenium_Morning\\src\\com\\html\\index.html");
		Thread.sleep(3000);
	
//		driver.findElement(By.partialLinkText("Click")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(2000);
		//driver.close();
	}
}
