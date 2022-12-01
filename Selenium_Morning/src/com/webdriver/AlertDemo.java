package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
	
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("Alert msg 1 is.. "+a1.getText());
		a1.accept();
		Thread.sleep(3000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println("Alert msg 2 is.. "+a2.getText());
		a2.accept();
		Thread.sleep(3000);
		driver.close();
		
	}
}
