package Selenium_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Ankush\\Downloads\\WebTable by ANKUSH.html");
	//print single row
		String row1=driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
		System.out.println(row1);
		
		//row2
		String row2=driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
		  System.out.println(row2); 
}
}
