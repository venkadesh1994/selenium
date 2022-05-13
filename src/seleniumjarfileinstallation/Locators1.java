package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
	from.sendKeys("raja");
	WebElement to = driver.findElement(By.xpath("//input[@tabindex='2']"));
to.sendKeys("chen");
WebElement date = driver.findElement(By.xpath("(//input[@class='db'])[3]"));
date.sendKeys("23/03/2022");
WebElement search = driver.findElement(By.xpath("(//button[@id='search_btn'])"));
search.click();


}
}
