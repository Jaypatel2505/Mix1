//W.A.J. Script To perform the radio button to select one by one in loop
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		for (int i = 1; i <=3; i++) {
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(2000);
		}
		driver.quit();
	}
}