package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Jerry {
	@Test 
	public void week()
	{
		System.out.println("Jerry is tiny");
		
	}
	@Before
public void beforemeth()	
	{
		System.out.println("Before Jerry");
	}
	
	@After
	public void aftermeth()
	{
		System.out.println("After Jerry");
	}

}
