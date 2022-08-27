package Selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Rajendra Yamgar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String expt="Google";
	
	String actT=driver.getTitle();
	if(actT.equals(actT)) {
		System.out.println("Test case Passed");
	}
	else {
		System.out.println("Test case Failed");
	}
}
}
