package seleniumjarfileinstallation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
public static void main(String[] args) throws AWTException  {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement best = driver.findElement(By.linkText("Best Sellers"));
	Actions ac = new Actions(driver);
	ac.contextClick(best).perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement moble = driver.findElement(By.linkText("Mobiles"));
	ac.contextClick(moble).perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	String onewindow = driver.getWindowHandle();
	System.out.println(onewindow);
	String title = driver.switchTo().window(onewindow).getTitle();
	System.out.println(title);
	
	Set<String> allwindows = driver.getWindowHandles();
	for (String string : allwindows) {
	String title2 = driver.switchTo().window(string).getTitle();
	System.out.println(title2);
	}	
	for (String string2 : allwindows) {
		if (driver.switchTo().window(string2).getTitle().equals("Amazon.in")) {
			break;
		}
	}
	
	
	
	
	
	
	
	
	
}
}
