package Framework_POM_with_PageFactory_DDFF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	//Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement cntBTN;
	
	//Initialization
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void pin(String pin) {
		PIN.sendKeys(pin);
	}
	public void button() {
		cntBTN.click();
	}
}
