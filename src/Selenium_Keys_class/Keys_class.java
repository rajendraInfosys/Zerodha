package Selenium_Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/* Usename
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
    //pwd
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    //click on login
    driver.findElement(By.xpath("//div[text()='Login ']")).click();*/
    
    //using Keys class
    driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
    		
    
}
}
