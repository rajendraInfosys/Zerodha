package TestNG_Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_3 {
	@Test
	public void TC7() {
		Reporter.log("running tc7",true);
	}
		@Test
	public void TC8() {
		Reporter.log("running tc8",true);
	}
		@Test
	public void TC9() {
		Reporter.log("running tc9",true);
	}
}
