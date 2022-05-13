package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
	
	List<WebElement> table = driver.findElements(By.xpath("//table[@border='1']/tbody/tr/td"));
	for (WebElement fulldata : table) {
		System.out.println(fulldata.getText());
	}
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@border='1']/tbody/tr[2]/td"));
	for (WebElement data1 : row) {
		System.out.println(data1.getText());
	}
	WebElement data2 = driver.findElement(By.xpath("//table[@border='1']/tbody/tr[2]/td[3]"));
	System.out.println(data2.getText());
	
	
	
	
}
}
