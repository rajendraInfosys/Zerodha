package Selenium_Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Custom_LB {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//Click on create account button
	Thread.sleep(3000);
	//Give path of the listbox
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//Select listbox of month
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//Create object of actions class
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	//Click on month
	act.click(month).perform();
	
}
}
