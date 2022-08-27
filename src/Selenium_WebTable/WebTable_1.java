package Selenium_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Ankush\\Downloads\\WebTable by ANKUSH.html");
	//print student name
    String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
    System.out.println(sn);
    //print sachin
    String schn = driver.findElement(By.xpath("(//table[@id='2244']//td)[2]")).getText();
    System.out.println(schn);
    
    //print sangli
    String str=driver.findElement(By.xpath("//table[@id='2244']/descendant::td[9]")).getText();
    System.out.println(str);
    
    //print shilpa
    String shetty = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
    System.out.println(shetty);
}
}
