package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	
}
}
