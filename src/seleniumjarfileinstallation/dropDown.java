package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.id("day"));
	Select s = new Select(date);
	s.selectByIndex(5);
	
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.id("month"));
	Thread.sleep(2000);
	Select s1 =new Select(month);
	s1.selectByVisibleText("Feb");
	
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByValue("2021");
	
	Thread.sleep(2000);
	WebElement box = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
	box.click();
	
	
	
	
	
}
}
