package Selenium_Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_classs {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Open the website
	driver.get("https://www.google.com/");
	//Give the path of target element and store in ref variable
	WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
	//Create object of actions class
	Actions act=new Actions(driver);
	//Move cursor on target element
	//act.moveToElement(images).perform();
	//Right click on target element
	//act.moveToElement(images).contextClick().perform();
	//Left click on target element
	//act.moveToElement(images).click().perform();
	//Double click on target element
	//act.moveToElement(images).doubleClick().perform();
	//Perform all 3 actions in single statement
	act.moveToElement(images).contextClick().click().build().perform();
}
}
