package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromedriver\\Chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	        driver.get("http://www.flipkart.in");
	}

}
