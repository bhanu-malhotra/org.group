package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Month {
	@Test (groups= {"calander"}) 
	public void month()
	{
		System.out.println("there are 12 months");
		
	}
	@Test (groups= {"cartoon"})
	public void month1()
	{
		System.out.println("there are 4-5 weeks in a month");
		
	}
	@Test (groups= {"cartoon"})
	public void month2()
	{
		System.out.println("there Are 30-31 days in a month");
		
	}
	@BeforeMethod
public void beforemeth()	
	{
		System.out.println("Before month");
	}
	
	@AfterMethod
	public void aftermeth()
	{
		System.out.println("After month");
	}

}
