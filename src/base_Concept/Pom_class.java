package base_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	public Pom_class(WebDriver driver2) {
this.driver=driver2;
	PageFactory.initElements(driver2,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
