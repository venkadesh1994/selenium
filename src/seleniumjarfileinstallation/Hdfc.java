package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" https://netbanking.hdfcbank.com/ ");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("venki");
	
	}

}
