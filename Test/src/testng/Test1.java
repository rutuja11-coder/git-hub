package testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@Test
	public void test11()
	{
		System.out.println("test11");
	}
	
	@Test
	public void test12()
	{
		System.out.println("test12");
	}
	
	@Test
	public void test13()
	{
		Assert.fail();
		System.out.println("test13");
	}
	
	
	

}
