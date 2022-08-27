package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class assertEquals {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="Anky";
		String actR="Anky";
		Assert.assertEquals(expR,actR);
	}
}

