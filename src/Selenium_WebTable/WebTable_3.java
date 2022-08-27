package Selenium_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Ankush\\Downloads\\WebTable by ANKUSH.html");
    for(int i=1;i<=5;i++) {
    	if(i==1) {
    		Thread.sleep(3000);
    	String str1=driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/th[1]")).getText();
    	System.out.println(str1);//it will give sr no
    	}
    	else {
    		Thread.sleep(3000);
    		String str2 = driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/td[1]")).getText();
    		System.out.println(str2);
    	}
    }
    
    
}
}
