//W.A.J.Script for Locating links by linkText() and partialLinkText()
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Link Text
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		
		//Partial Link Text
		driver.findElement(By.partialLinkText("For")).click();
		Thread.sleep(10000);
		
		driver.quit();
	}
}