package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tom {

	@Test 
	public void tom()
	{
		System.out.println("tom is Big");
		
	}
	@Before
public void beforemeth()	
	{
		System.out.println("Before Tom");
	}
@After
	public void aftermeth()
	{
		System.out.println("After TOM");
	}

}
