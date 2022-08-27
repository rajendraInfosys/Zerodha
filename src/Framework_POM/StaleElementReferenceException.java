package Framework_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    WebElement txtfield = driver.findElement(By.xpath("//input[@name='q']"));//@1010
    txtfield.sendKeys("Indian movie");
    driver.navigate().refresh();//@2020
    txtfield.sendKeys("Sairat");
    
    
}
}
