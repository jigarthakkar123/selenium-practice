package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:\\Users\\Tops\\Jigar_Selenium_Practice\\Selenium_Practice\\src\\html\\TableDemo.html");
		Thread.sleep(2000);
		
		WebElement t1=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[5]"));
		System.out.println(t1.getText());
		Thread.sleep(2000);
		for(int i=2;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				WebElement t2=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print("	|	"+t2.getText());
				
				Thread.sleep(1000);
			}
			System.out.println();
		}
		driver.close();
	}
}
