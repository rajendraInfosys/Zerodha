package TestNG_Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_2 {
	@Test
	public void TC4() {
		Reporter.log("running tc4",true);
	}
		@Test
	public void TC5() {
		Reporter.log("running tc5",true);
	}
		@Test
	public void TC6() {
		Reporter.log("running tc6",true);
	}
}
