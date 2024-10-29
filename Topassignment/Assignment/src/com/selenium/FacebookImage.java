package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookImage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement logo= driver.findElement(By.xpath("//a[@tabindex='0']"));
		
		if(logo.isDisplayed()) {
			System.out.println("Logo is Visible");
		}else {
			System.out.println("Not Visible");
		}
		driver.close();
	}
}
