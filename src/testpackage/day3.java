package testpackage;

import org.testng.annotations.Test;

public class day3 {
@Test
public void Weblogincarloan() {
	//selenium
	System.out.println("Weblogincarloan");
}
@Test 
public void mobilelogincarloan() {
	//appium
	System.out.println("mobilelogincarloan");
	
}
@Test  (dependsOnMethods={"mobilesignoutcarloan"})
public void mobilesignincarloan() {
	//appium
	System.out.println("mobile signin carloan");
}
	@Test
	public void mobilesignoutcarloan() {
		//appium
		System.out.println("mobile signoff carloan");
	}
@Test
public void Apilogincarloan()
{
	//restapi
	System.out.println("Apilogincarloan");
}
}
