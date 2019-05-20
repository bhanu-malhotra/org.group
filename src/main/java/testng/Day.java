package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day {

	@Test (groups= {"calander","cartoon"})
	public void day()
	{
		System.out.println("there are 365 days");
		
	}
	@Test (groups= {"calander","cartoon"})
	public void day1()
	{
		System.out.println("there are 24 hours in a day");
		
	}
	@BeforeMethod
public void beforemeth()	
	{
		System.out.println("Before Day");
	}
	
	@AfterMethod
	public void aftermeth()
	{
		System.out.println("After Day");
	}

}
