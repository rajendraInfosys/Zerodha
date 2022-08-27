package Selenium_Cases_for_relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Contains_3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//   //tagname[contains(@AN,'AV')]
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	//   //tagname[text()='text']
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	String expT="actiTIME - Login";
	String actT=driver.getTitle();
	
	if(expT.equals(actT)) {
		System.out.println("Test case passed");
	}
	else {
		System.out.println("Test case failed");
	}
}
}
