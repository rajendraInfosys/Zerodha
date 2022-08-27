package Selenium_Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_virus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/country/uk");
    //get the text of recovered cases
    String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
    System.out.println(recover);
    String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number']/span)[1]")).getText();
    System.out.println(cases);
    String deaths = driver.findElement(By.xpath("(//div[@class='maincounter-number']/span)[2]")).getText();
    System.out.println(deaths);
}
}
