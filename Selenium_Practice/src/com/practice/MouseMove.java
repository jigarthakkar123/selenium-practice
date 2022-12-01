package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flight=driver.findElement(By.linkText("Flights"));
		WebElement hotel=driver.findElement(By.linkText("Hotels"));
		WebElement car=driver.findElement(By.linkText("Car Rentals"));
		WebElement cruis=driver.findElement(By.linkText("Cruises"));
		WebElement destination=driver.findElement(By.linkText("Destinations"));
		WebElement vacation=driver.findElement(By.linkText("Vacations"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(1000);
		
		Action a2=actions.moveToElement(flight).build();
		a2.perform();
		Thread.sleep(1000);
		 
		Action a3=actions.moveToElement(hotel).build();
		a3.perform();
		Thread.sleep(1000);
		
		Action a4=actions.moveToElement(car).build();
		a4.perform();
		Thread.sleep(1000);
		
		Action a5=actions.moveToElement(cruis).build();
		a5.perform();
		Thread.sleep(1000);
		
		Action a6=actions.moveToElement(destination).build();
		a6.perform();
		Thread.sleep(1000);
		
		Action a7=actions.moveToElement(vacation).build();
		a7.perform();
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		driver.close();
	}
}
