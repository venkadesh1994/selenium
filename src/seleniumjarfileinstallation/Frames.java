package seleniumjarfileinstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\seleniumjarfileinstallation\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement sframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(sframe);
		System.out.println("====hi====");
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("venki");
		
		driver.switchTo().defaultContent();
		System.out.println("====fyn====");
		
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();
		System.out.println("helo");
		
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outer);
		System.out.println("vjenvje");
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(inner);
		System.out.println("sdfvga");
		
		WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
		text2.sendKeys("testing");
		
		
		driver.switchTo().parentFrame();
		
		//driver.switchTo().parentFrame();
		
		System.out.println("hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
