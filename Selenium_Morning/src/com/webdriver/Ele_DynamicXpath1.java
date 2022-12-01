package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_DynamicXpath1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(3000);
		
		String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b")).getText();
		System.out.println("Your Text is.. "+text);
		Thread.sleep(2000);
		
		String text1=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/h4[1]/b")).getText();
		System.out.println("Text 1 is.. "+text1);
		driver.close();
	}
}
