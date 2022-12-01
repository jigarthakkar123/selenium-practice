package com.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		
		driver.close();
	}
}
