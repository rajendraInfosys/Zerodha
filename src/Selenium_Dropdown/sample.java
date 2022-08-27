package Selenium_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
public static void main(String[] args) {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	List<WebElement> allOption = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	for(WebElement oneOption:allOption){
		String text = oneOption.getText();
		System.out.println(text);
	}
	}
}
