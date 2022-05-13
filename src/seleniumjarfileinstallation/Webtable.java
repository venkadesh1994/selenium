package seleniumjarfileinstallation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : table) {
			System.out.println(data.getText());
			
		}
		
		
		List<WebElement> row3 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
		
		for (WebElement parrow  : row3) {
			System.out.println(parrow.getText());
		}
		
		WebElement column = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(column.getText());
		
		
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement r1: head) {
			System.out.println(r1.getText());
			}
		
		
		
		
		
		
		
		
	}

}
