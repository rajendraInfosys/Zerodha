package Selenium_Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element_Handling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    //click on cancel btn
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    //search for m,mobile
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
    Thread.sleep(3000);
    //Navigate to dynamic element(make sure that u r taking class)
    String review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
    System.out.println(review);
    //using descendant(optional)
    String review1 = driver.findElement(By.xpath("(//div[@class='col col-7-12']/descendant::span)[6]")).getText();
    System.out.println(review1);
    String ratings = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[10]")).getText();
    System.out.println(ratings);
    
}
}
