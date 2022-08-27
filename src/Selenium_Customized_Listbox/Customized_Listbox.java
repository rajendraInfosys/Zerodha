package Selenium_Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_Listbox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	  //click on create new account btn
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  //select list box of month
	  Thread.sleep(3000);
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  //create object of Actions class
	  Actions act=new Actions(driver);
	  //click on month
	  Thread.sleep(3000);
	  act.click(month).perform();
	  //move to upside
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
	  //move down
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  //select topmost element
	  act.sendKeys(Keys.HOME).perform();
	  //click on element
	  act.sendKeys(Keys.ENTER).perform();
	  
	  
}
}
