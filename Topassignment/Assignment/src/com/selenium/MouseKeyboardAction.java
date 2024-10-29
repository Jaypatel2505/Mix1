package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions hover= new Actions(driver);
		WebElement menu= driver.findElement(By.xpath("//a[normalize-space()='Hotels']"));
		hover.moveToElement(menu).perform();
		Thread.sleep(2000);
		
		WebElement menu1= driver.findElement(By.xpath("//a[normalize-space()='Destinations']"));
		hover.moveToElement(menu1).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Jay");
		WebElement copy= driver.findElement(By.name("firstName"));
		copy.sendKeys(Keys.CONTROL +"a");
		
		hover.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement paste= driver.findElement(By.name("lastName"));
		paste.click();
		hover.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		
		
		driver.quit();
	}
}
