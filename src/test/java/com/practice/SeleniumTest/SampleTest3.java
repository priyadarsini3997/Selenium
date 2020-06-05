package com.practice.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna priya\\eclipse-workspace\\SeleniumTest\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Button.html");
	
}
}
