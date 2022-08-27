package Selenium_Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mohfw.gov.in/");
	//1st identify the element which we are going to handle
	String text = driver.findElement(By.xpath("(//strong[@class='mob-hide'])[2]")).getText();
	System.out.println(text);
	String text1 = driver.findElement(By.xpath("(//div[@class='fullbol']//span)[2]")).getText();
	System.out.println(text1);
}
}
