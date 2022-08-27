package Selenium_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {
public static void main(String[] args) {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    //inspect cross button of popup
    driver.findElement(By.xpath("//button[text()='✕']")).click();
}
}
