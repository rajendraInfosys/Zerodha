package Selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_currentURL_title {
public static void main(String[] args) {
	System.setProperty("webdrover.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Rajendra Yamgar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String link=driver.getCurrentUrl();
	System.out.println(link);
	
	System.out.println();
	
	String title=driver.getTitle();
	System.out.println(title);
}
}
