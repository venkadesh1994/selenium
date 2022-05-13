package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	WebElement singleframe = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(singleframe);
	System.out.println("====s====");
	
	Thread.sleep(2000);
	WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
	txt.sendKeys("hi");
	driver.switchTo().defaultContent();
	System.out.println("---ss---");
	
	Thread.sleep(2000);
	WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	iframe.click();
	
	Thread.sleep(2000);
	WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(outer);
	System.out.println("hdfshb");
	
	
	WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(inner);
	System.out.println("jjjjj");
	
	Thread.sleep(2000);
	WebElement txt1 = driver.findElement(By.xpath("//input[@type='text']"));
	txt1.sendKeys("helo");
	
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.switchTo().parentFrame();
	
	System.out.println("venki");
	
	
	
	
	
	
	
	
}
}
