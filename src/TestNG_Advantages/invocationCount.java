package TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {
	@Test(invocationCount=5)
	public void TC() {
		Reporter.log("running tc",true);
	}
}
