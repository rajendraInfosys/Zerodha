package Selenium_Multiple_element_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multile_element_handle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> ele=driver.findElements(By.xpath("//div"));
	for(WebElement i:ele) {
		String str=i.getText();
		System.out.println(str);
		
		
	}
	
	 
}
}
