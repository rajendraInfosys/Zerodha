package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertFalse {
	@Test
	public void TC4() {
		Reporter.log("running TC4",true);
		boolean actR=false;
		Assert.assertFalse(actR);
}
}
