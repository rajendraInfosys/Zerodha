package Framework_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {
public static void main(String[] args) {
	//set the properties
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Yamgar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://twitter.com/i/flow/login");
		    //maximize
		    driver.manage().window().maximize();
		    //implicitly wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    POM p=new POM(driver);
		    p.AppleLogin();
		    p.enterUN();
		    p.forgot();
		    p.GoogleLogin();
		    p.next();
		    
		    
}
}
