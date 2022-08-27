package Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdownn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
	Thread.sleep(3000);
	List<WebElement> allOption = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	for(WebElement oneOption:allOption) {
		String text = oneOption.getText();
		System.out.println(text);
		if(text.contains("kgf 2 box office collection")) {
			oneOption.click();
		}
	}
}
}
