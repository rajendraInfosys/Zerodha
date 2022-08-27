package Selenium_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
    //Maximize the browser
    driver.manage().window().maximize();
    Thread.sleep(3000);
    //Switch to 1st frame from main page
    driver.switchTo().frame("packageListFrame");
    //Get text from 1st frame
    String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
    System.out.println(text);
    Thread.sleep(3000);
    //Switch to main frame
    driver.switchTo().defaultContent();
    //switch to 2nd frame
    driver.switchTo().frame("packageFrame");
    String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
    System.out.println(text1);
    Thread.sleep(3000);
    //Switch to main page
    driver.switchTo().defaultContent();
    //switch to 3rd frame
    driver.switchTo().frame("classFrame");
    String text2 = driver.findElement(By.xpath("//a[text()='Alert']")).getText();
    System.out.println(text2);
  
    
    
}
}
