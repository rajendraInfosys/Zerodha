package Selenium_Actions_class;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Actions_class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 FluentWait wait= new FluentWait(driver).withTimeout(Duration.ofSeconds(50));
	 //inspect for target element
	  WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	  //create object of Actions class
	  Actions act=new Actions(driver);
	  //>>>1 movetoelement()
	  act.moveToElement(gmail).perform();
	  
	  
	  //>>2 right click(contextclick())
	 // act.moveToElement(gmail).contextClick().perform();
	  
	  
	  //>>3 left click/click()
	  
	// act.moveToElement(gmail).click().perform();
	 
	 //>>4 double click()
	// act.moveToElement(gmail).doubleClick().perform();
	 
	 //how to perform 3 actions in single statement
	  act.moveToElement(gmail).contextClick().doubleClick().build().perform();
	 
}
}
