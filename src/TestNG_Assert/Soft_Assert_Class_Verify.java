package TestNG_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class_Verify {
	@Test
	public void Tc1() {
		Reporter.log("running TC1",true);
		String expR="Hi";
		String actR="Bye";
		//object of softassert
		/*SoftAssert s=new SoftAssert();
		s.assertEquals(expR,actR);//verification 1
		System.out.println("I am after failed verification ");
		//mandatory 
		s.assertAll();
	}
	@Test
	public void TC2() {
		Reporter.log("Hii hello");
	}*/
		//object of softassert
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR); //vERFICATION1
		Reporter.log("I am after fail", true);
		s.assertAll();
	}
		
}
