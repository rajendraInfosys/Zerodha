package Framework_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) {
	//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //1st pom class
	    KiteLogin1Page login1=new KiteLogin1Page(driver);
	    login1.enterUN();
	    login1.enterPWD();
	    login1.clickLOGINBTN();
	    
	    //2nd pom class
	    KiteLogin2Page login2=new KiteLogin2Page(driver);
	    login2.enterPIN();
	    login2.clickcntBtn();
	    
	    //3rd class
	    KiteHomePage hm=new KiteHomePage(driver);
	    hm.verifyuserID();
	    driver.close();
}
}
