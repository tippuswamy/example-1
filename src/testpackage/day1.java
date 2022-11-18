package testpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"URL","USERNAME"})
	@Test
public void demo1(String URL,String USERNAME)
{
System.out.println("this is demo1");	
System.out.println(URL);	
System.out.println(USERNAME);	


}
 @Test(groups= {"Smoke"})
	
public void demo2()
		{
	 System.out.println("this is demo2");	

		}
 @AfterTest
 public void Aftertest()
 {
	 System.out.println(" i will excute last");
 }
	}

