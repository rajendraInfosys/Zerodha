package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotEquals {
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
		String expR="Rinky";
		String actR="Rinky";
		Assert.assertNotEquals(expR,actR);
	}
}
