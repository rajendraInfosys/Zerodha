package Selenium_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
	Thread.sleep(3000);
	List<WebElement> alloption = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	//use for each loop
	for(WebElement oneoption:alloption) {
		String text = oneoption.getText();
		System.out.println(text);
		
		//if(text.contains("kgf 2 collection")) {
			//oneoption.click();
		//}	
	}
}
}
