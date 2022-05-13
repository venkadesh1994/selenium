package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
	id.sendKeys("venki");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("1234567");
}
}
