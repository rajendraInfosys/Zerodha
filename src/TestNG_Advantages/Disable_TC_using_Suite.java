package TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TC_using_Suite {
	@Test
	public void TC1() {
		Reporter.log("running tc1",true);
	}
		@Test
		public void TC2() {
			Reporter.log("running tc2",true);
		}
		@Test
		public void TC3() {
			Reporter.log("running tc3",true);
		}
}
