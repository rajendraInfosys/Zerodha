package Selenium_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Perticular_element_screenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    //i want to take scrnshot of particular element(inspect element store in ref variable)
    WebElement gTitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
    File src = gTitle.getScreenshotAs(OutputType.FILE);
    //store at destination
    File dest=new File("C:\\Users\\Ankush\\OneDrive\\Desktop\\reports\\Googletitle.jpg");
    //source to destination
    Files.copy(src, dest);
}
}
