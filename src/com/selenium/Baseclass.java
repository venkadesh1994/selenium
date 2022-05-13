package com.selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) {
if (browsername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+("\\driver\\chromedriver.exe"));
	driver = new ChromeDriver();
	}
else if (browsername.equalsIgnoreCase("edge")) {
	
	System.setProperty("webdriver.edge.driver",
			System.getProperty("user.dir")+(""));

	driver= new EdgeDriver();
}

	driver.manage().window().maximize();
	return driver;
	}
	
	public static void geturl(String value) {

		driver.get(value);
		
	}
	
	public static void sendk(WebElement element, String value) {

		element.sendKeys(value);
	}
	
	public static void clck(WebElement element) {
element.click();
	}
	
	public static void clr(WebElement element, String value) {
element.clear();
		
	}
	
	public static void action(WebElement element) {

		Actions ac = new Actions(driver);
		ac .contextClick(element).perform();
		
	}
	
	public static void action1(WebElement element) {

Actions ac = new Actions(driver);
ac.click(element).perform();
		
	}
	 public static void action2(WebElement element) {
Actions ac = new Actions(driver);
ac.doubleClick(element).perform();
	}
	
	public static void action3(WebElement element) {
Actions ac = new Actions(driver);
	ac.moveToElement(element).perform();
	}
	public static void clse(WebElement element) {
driver.close();
		}
	public static void qt() {
driver.quit();
	}
	public static void accept() {
driver.switchTo().alert().accept();
	}
	public static void dismis() {
driver.switchTo().alert().dismiss();
		}
	public static void navigate(String value) {
driver.navigate().to(value);
	}
	public static void refresh(String value) {
driver.navigate().refresh();
	}
	public static void back() {
driver.navigate().back();
	}
	
public static void scrolldownup() {
JavascriptExecutor js =  (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,2000");
}	
	public static void screenshot() throws IOException {
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File desh = new File("C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\Screenshot.png");
FileUtils.copyFile(source, desh);
	}
	

















}
