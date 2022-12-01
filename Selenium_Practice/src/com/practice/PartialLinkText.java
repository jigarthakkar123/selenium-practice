package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\Tops\\Jigar_Selenium_Practice\\Selenium_Practice\\src\\html\\index.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Tops Technologies");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
