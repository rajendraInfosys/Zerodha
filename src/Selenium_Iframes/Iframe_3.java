package Selenium_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.switchTo().frame("packageListFrame");
	String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String text1 = driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();
	System.out.println(text1);
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	String text2 = driver.findElement(By.xpath("(//th[@class='colFirst'])[1]")).getText();
	System.out.println(text2);
	
	
	
}
}
