package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Rajendra Yamgar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
	Select s=new Select(dropdown);
	s.selectByIndex(1);
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
	Select s1=new Select(dropdown1);
	s1.selectByValue("1");
	
}
}
