package com.practice.SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krishna priya\\eclipse-workspace\\SeleniumTest\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		 * String title = driver.getTitle(); System.out.println(title); String url =
		 * driver.getCurrentUrl(); System.out.println(url); driver.quit();
		 */
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("priya123@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("asdf");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	

	}
}
