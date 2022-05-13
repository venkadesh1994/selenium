package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\eclipse-workspace\\\\\\\\seleniumjarfileinstallation\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver ();
	driver.get(" http://adactinhotelapp.com/");
	WebElement id = driver.findElement(By.xpath("//input[@id='username']"));
	id.sendKeys("venki");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("1234556");
}
}
