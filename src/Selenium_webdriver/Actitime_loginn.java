package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_loginn {
public static void main(String[] args) {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	String expT="actiTIME - Login";
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("passed");
	}
	else {
		System.out.println("Failed");
	}
}
}
