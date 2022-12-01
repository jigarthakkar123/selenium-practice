package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\Tops\\Jigar_Selenium_Practice\\Selenium_Practice\\src\\html\\alert.html");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("jigar.thakkar.tops@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("action")).click();
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("Alert Msg Is : "+a1.getText());
		Thread.sleep(2000);
		a1.dismiss();
		Thread.sleep(2000);
		driver.close();
	}
}
