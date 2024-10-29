// W.A.J.Script To write a script for drop down.
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement sdrop= driver.findElement(By.xpath("//select[@name='country']"));
		Select sdrop1= new Select(sdrop);
		sdrop1.selectByVisibleText("GUAM");
		Thread.sleep(2000);
		driver.close();
	}
}
