package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups= {"Smoke"})
	public void Webloginhomeloan() {
		//selenium
		System.out.println("Weblogin homeloan");
	}
	@Test(groups= {"Smoke"}) 
	public void mobileloginhomeloan() {
		//appium
		System.out.println("mobile login homeloan");
	}
	@Test(dataProvider="getdata")
	public void Apiloginhomeloan(String username,String password)
	{
		//restapi
		System.out.println("Api login homeloan");
		System.out.println(username);
		System.out.println(password);

	}
	@DataProvider
	public Object[][] getdata
	()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="first set of data";
		data[0][1]="1234";
		data[1][0]="second set of data";
		data[1][1]="5678";
		data[2][0]="third set of data";
		data[2][1]="90123";
		return data;
		
	}
}
