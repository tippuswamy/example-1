package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void example1()
	{
		System.out.println("example1");
	}
	@BeforeTest
public void presuit() {
	System.out.println("i am presuit excuter");}
}
