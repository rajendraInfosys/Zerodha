package Framework_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDFF {
public static void main(String[] args) throws Throwable {
	//Handle notifications popup
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--disable-notifications");
	//Set the properties
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://kite.zerodha.com/");
	//wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Maximize the browser
	driver.manage().window().maximize();
	//Create object of fileInputStream class
	FileInputStream file=new FileInputStream("C:\\Users\\Rajendra Yamgar\\OneDrive\\Documents\\Parameterization_Sheet.xlsx");
	//Open excel sheet using create method
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	//Enter UN 
	String UN = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	String PWD = sh.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
}
}
