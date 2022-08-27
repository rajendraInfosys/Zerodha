package TestNG_MultiBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing {
	@SuppressWarnings("deprecation")
	@Parameters("browsername")//annotation
	@Test
	public void TC(String browsername) {//paramerized method
			WebDriver driver=null;//runtime polymorphism
		
			if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
			else if(browsername.equals("Firefox")) {
				System.setProperty("webdriver.opera.driver","C:\\Users\\Rajendra Yamgar\\Downloads\\OperaSetup (2).exe");
				 driver=new OperaDriver();
				
			}
			driver.get("https://kite.zerodha.com/");
			
			
	}
}
