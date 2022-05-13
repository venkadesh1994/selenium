package seleniumjarfileinstallation;

import javax.security.auth.Refreshable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\seleniumjarfileinstallation\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().to("http://www.instagram.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.close();
	driver.quit();
}
}
