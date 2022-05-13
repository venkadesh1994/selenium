package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	WebElement simple = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	simple.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	WebElement simple1 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	simple1.click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	WebElement simple2 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	simple2.click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("venki");
	driver.switchTo().alert().accept();
	WebElement simple3 = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
	simple3.click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
WebElement simple4 = driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
simple4.click();
Thread.sleep(2000);
driver.switchTo().alert().accept();




}
}
