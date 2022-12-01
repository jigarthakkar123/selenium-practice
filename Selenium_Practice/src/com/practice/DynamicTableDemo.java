package com.practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Downloads\\jigar (1)\\jigar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		
		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(int i=1;i<=th.size();i++)
		{
			String thname1=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
			System.out.println(thname1);
		}
		Thread.sleep(2000);
		
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		for(int i=1;i<=tr.size();i++)
		{
			String thname1=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]")).getText();
			System.out.println(thname1);
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
