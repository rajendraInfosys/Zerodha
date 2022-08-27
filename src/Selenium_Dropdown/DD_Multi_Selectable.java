package Selenium_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD_Multi_Selectable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("werbdriver.chrome.driver", "C:\\\\Users\\\\Rajendra Yamgar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Rajendra Yamgar\\OneDrive\\Documents\\Softwate Testing\\GoodLuck_multiple.html");
	Thread.sleep(3000);
	//Inspect DD
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='GoodLuck']"));
	Thread.sleep(3000);
	//Create object of select class
	Select s=new Select(dropdown);
	//Check DD is multiselectable
	if(s.isMultiple()) {
		System.out.println("DD is multiselectable");
	}
	else {
		System.out.println("DD is single selectable");
	}
	//Size of DD
	List<WebElement> allOption = s.getOptions();
	System.out.println(allOption.size());
	//Get all elements
	for(WebElement oneOption:allOption) {
		String text = oneOption.getText();
		System.out.println(text);
	}
}
}
