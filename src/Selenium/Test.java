package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws Exception {
	//set the properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//for upcasting
	WebDriver driver=new ChromeDriver(); //upcasted statement
	//open the browser
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(5000);
	driver.close();
}
}
