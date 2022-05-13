package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		   email.sendKeys("helo");
		   WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		   password.sendKeys("123456");
		   WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
