package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
}
}
