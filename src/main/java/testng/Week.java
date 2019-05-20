package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Week {
	
	@Test (groups= {"calander"})
	public void week()
	{
		System.out.println("there are 52 weeks");
		
	}
	@Test (groups= {"calander"})
	public void week1()
	{
		System.out.println("A week have 7 days");
		
	}
	@BeforeMethod
public void beforemeth()	
	{
		System.out.println("Before week");
	}
	
	@AfterMethod
	public void aftermeth()
	{
		System.out.println("After week");
	}

}
