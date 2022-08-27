package Selenium_Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Custom_LBX {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ARROW_UP);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.HOME);
	act.sendKeys(Keys.ENTER);
}
}
