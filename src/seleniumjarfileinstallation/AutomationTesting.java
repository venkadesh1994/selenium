package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text'][1]"));
		firstname.sendKeys("venki");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("j");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("rajapalayam");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("j.venki14@gmail.com");
		WebElement num = driver.findElement(By.xpath("//input[@type='tel']"));
		num.sendKeys("8148995055");
		
	}

}
