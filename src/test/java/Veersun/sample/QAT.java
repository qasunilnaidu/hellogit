package Veersun.sample;

import org.testng.annotations.Test;

public class QAT {

	
	@Test
	public void m1() {
		
		System.out.println("This is m1 method");
		
	}
	
@Test(priority=1)
public void m2() {
	
	
	System.out.println("This is pririty test");
	
}
	
}
