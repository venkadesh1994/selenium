package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_concepts {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	simple.click();
	Thread.sleep(2000);
	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	confirm.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	WebElement simple1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	simple1.click();
	WebElement confirm1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirm1.click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	WebElement simple2 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	simple2.click();
	WebElement confirm2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	confirm2.click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("im venki");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
	
}
}
