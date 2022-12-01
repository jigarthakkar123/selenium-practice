package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_Table1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rahul\\st\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("file:///C:\\Users\\LearnVern\\eclipse-workspace\\Selenium_Morning\\src\\com\\html\\index2.html");
		Thread.sleep(3000);
		
//		String degree=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[3]")).getText();
//		System.out.println("Degree is.. "+degree);
		
//		for(int i=1;i<=1;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				String value =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText();
//				System.out.print("		"+value);
//				Thread.sleep(1000);
//			}
//			System.out.println();
//		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1)
				{
					String value =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText();
					System.out.print("		"+value);
					Thread.sleep(1000);
				}
				else
				{
					String value =driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print("		"+value);
					Thread.sleep(1000);
				}
			}
			System.out.println();
		}
	}
}
