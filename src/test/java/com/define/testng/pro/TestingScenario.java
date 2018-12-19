package com.define.testng.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingScenario {
WebDriver driver;
@Test
public void testCase_01() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://flipkart.com");
}
}
