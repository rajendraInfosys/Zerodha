package Framework_POM_with_PageFactory_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) throws Throwable {
	//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Create object of FileInputStream class
		FileInputStream file=new FileInputStream("C:\\Users\\Rajendra Yamgar\\OneDrive\\Documents\\Parameterization_Sheet.xlsx");
		//open excel sheet using create method
	  	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  //call 1st pom class  
	    KiteLogin1Page login1=new KiteLogin1Page(driver);
	    String username = sh.getRow(0).getCell(0).getStringCellValue();
	    login1.enterUN(username);
	    
	    String password = sh.getRow(0).getCell(1).getStringCellValue();
	    login1.enterPWD(password);
	    
	    login1.clickLOGINBTN();
	    
	    //call 2nd pom class
	    KiteLogin2Page login2=new KiteLogin2Page(driver);
	    String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
	    login2.enterPIN(pinvalue);
	    
	    login2.clickcntBtn();
	    
	    //call 3rd pom class
	    	KiteHomePage home=new KiteHomePage(driver);
	    	 String expuserid = sh.getRow(0).getCell(0).getStringCellValue();
	    	 home.verifyuserID(expuserid);
	    	 driver.close();
}
}
