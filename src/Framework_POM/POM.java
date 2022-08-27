package Framework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	//Declaration
	@FindBy(xpath = "//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")private WebElement LoginWithGoogle;
	@FindBy(xpath = "//span[text()='Continue with Apple']")private WebElement LoginWithApple;
	@FindBy(xpath = "//input[@name='text']")private WebElement UN;
	@FindBy(xpath = "//span[text()='Next']")private WebElement NextButton;
	@FindBy(xpath = "//span[text()='Forgot password?']") private WebElement ForgotButton;
	
	//Initialisation
	public POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Implementation
	public void GoogleLogin() {
	LoginWithGoogle.click();
	}
	public void AppleLogin() {
		LoginWithApple.click();
	}
	public void enterUN() {
		UN.sendKeys("rajendrayamgar");
	}
	public void next() {
		NextButton.click();
	}
	public void forgot() {
		ForgotButton.click();
	}
}
