package seleniumjarfileinstallation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_order_product {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		all.click();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone");
	
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement iphone = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		iphone.click();
		
		
		Set<String> allwindows= driver.getWindowHandles();
for (String string : allwindows) {
	String title = driver.switchTo().window(string).getTitle();
	System.out.println(title);
}		
		for (String string : allwindows) {
			if (driver.switchTo().window(string).getTitle().equals("Amazon.in")) {
				break;
			}
		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
	
		
	WebElement order = driver.findElement(By.xpath("(//input[@type='submit'])[8]"));
	order.click();
		
		
		
		
		
		
		
	}

}
