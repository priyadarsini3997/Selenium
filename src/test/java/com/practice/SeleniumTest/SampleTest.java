package com.practice.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\krishna priya\\eclipse-workspace\\SeleniumTest\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("http://www.google.co.in");
		//driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//driver.findElement(By.partialLinkText("Home Page")).click();
		/*WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("priyadarsini3997@gmail.com");
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
        appendbox.clear();
        appendbox.sendKeys("priya");
		WebElement getattri = driver.findElement(By.name("username"));
		String si = getattri.getAttribute("value");
		System.out.println(si);
		WebElement clearbox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearbox.clear();
		WebElement disablebox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enable = disablebox.isEnabled();
		System.out.println(enable);*/
	}

}
		
		
		
		
		
		