package Selenium_Cases_for_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Contains_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
