package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\Tops\\Jigar_Selenium_Practice\\Selenium_Practice\\src\\html\\alert.html");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("jigar.thakkar.tops@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Index")).click();
		Thread.sleep(2000);
		
		String mainw=driver.getWindowHandle();
		System.out.println("Main Window : "+mainw);
		
		Set<String> allw=driver.getWindowHandles();
		Iterator<String> itr=allw.iterator();
		while(itr.hasNext())
		{
			String chldw=itr.next();
			System.out.println("Child Window : "+chldw);
			if(!mainw.equals(chldw))
			{
				driver.switchTo().window(chldw);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(mainw);
		Thread.sleep(2000);
		driver.close();
	}
}
