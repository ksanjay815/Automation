package Test_NG;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority = 3, groups = "login", description="this is LogIn pg test")
	public void m1() {
		System.out.println("one");
		Reporter.log("sanjay kumar");
		Assert.fail();
		
		
	}

	@Test(priority = 2, invocationCount=4)
	public void m2() {
		System.out.println("two");
	}

	@Test(enabled = false)
	public void m3() {
		System.out.println("three");
	}

	@Test(priority = 1, groups="sign in", description="this is signIn pg test")
	public void m4() {
		System.out.println("four");
	}
	@Test(priority = 0, groups="Homepage", dependsOnMethods= {"m1"},alwaysRun=true)
	public void m5() {
		System.out.println("four");
}}