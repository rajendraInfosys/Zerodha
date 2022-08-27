package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue {
	@Test
	public void TC3() {
		Reporter.log("running TC3",true);
		boolean actR=true;
		Assert.assertTrue(actR);
	}
}
