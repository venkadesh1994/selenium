package base_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_class {
	public WebDriver driver;

	@FindBy(id="radiobutton_0")
	private WebElement click;
	
	@FindBy(name="continue")
	private WebElement contine;

	public Pom2_class(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getContine() {
		return contine;
	}
	
	
	
	
	
	
	
	
	
}







