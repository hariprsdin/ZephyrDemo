package Demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginusecase {
	public void login() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://SafetyFirst/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Welcome to Jenkins");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Assert.assertEquals("https://www.google.co.in/", driver.getCurrentUrl());
		System.out.println("Title:"+ driver.getTitle());
		driver.quit();
	}
}
