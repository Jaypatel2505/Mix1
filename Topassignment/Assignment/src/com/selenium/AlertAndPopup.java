//W.A.J. script to use different methods to manage the windows-alerts and pop ups.
package com.selenium;

public class AlertAndPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Vinay\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
//		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
		Thread.sleep(2000);
		
		driver.quit();
	}
}
