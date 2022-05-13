package base_Concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
if (browsername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+("\\driver\\chromedriver.exe"));
driver=new ChromeDriver();
}
else if (browsername.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver",
			System.getProperty("user.dir")+("\\\\driver\\\\chromedriver.exe"));
	driver = new EdgeDriver();
}
driver.manage().window().maximize();
return driver;
	}
	public static void geturl(String value) {
try {
	driver.get(value);
} catch (Exception e) {
	e.printStackTrace();
}
	}
public static void sendk(WebElement element, String value) {
try {
	element.sendKeys(value);
} catch (Exception e) {
	e.printStackTrace();
}
}
public static void clk(WebElement element) {
try {
	element.click();
} catch (Exception e) {
	e.printStackTrace();
}
}

public static void close() {
driver.close();
}
public static void quit() {
driver.quit();
}
public static void navigate(String value) {
driver.navigate().to(value);
}
public static void back(String value) {
driver.navigate().back();
}
public static void forward(String value) {
driver.navigate().forward();
}
public static void refresh(String value) {
driver.navigate().refresh();
}
public static void alert() {
driver.switchTo().alert().accept();
}
public static void alert1() {
driver.switchTo().alert().dismiss();
}
public static  void action(WebElement element) {
Actions ac = new Actions(driver);
ac.moveToElement(element).perform();
}
public static void action1(WebElement element) {
Actions ac = new Actions(driver);
ac.contextClick(element).perform();
}
public static void action2(WebElement element) {
Actions ac = new Actions(driver);
ac.click(element).perform();
}
public static void action3(WebElement element) {
Actions ac = new Actions(driver);
ac.doubleClick(element).perform();
}
public static void action4(WebElement element) {
Actions ac = new Actions(driver);
ac.dragAndDrop(element, element).perform();
}
public static void frames(WebElement element,String value) {
	driver.switchTo().frame(value);
}
public static void frames1() {
driver.switchTo().defaultContent();
}
public static void frames2() {
driver.switchTo().parentFrame();
}
public static void robot(WebElement element, String string) throws Throwable {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);

}
public static void windows(String value) {
driver.getWindowHandles();
driver.switchTo().window(value).getTitle().equals(value);
}
public static void drop(WebElement element,String value) {
Select s = new Select(element);
s.selectByVisibleText(value);
}
public static void drop1(WebElement element, int value) {
Select s=new Select(element);
s.selectByIndex(value);
}
public static void drop2(WebElement element,String value) {
Select s= new Select(element);
s.selectByValue(value);
}
public static void title(String value) {
driver.getTitle();
}
}




















