package learnAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	
	@BeforeTest
	public void brush() {
		System.out.println("brush");
	}
	@BeforeClass
	public void getReady() {
		System.out.println("wear formals");
	}
	
	@BeforeMethod
	public void getIntoOfc() {
		System.out.println("getIntoOfc");
	}
	@Test
	public void mainTask() {
		System.out.println("mainTask");
	}
	@AfterMethod
	public void goOutofOFC() {
		System.out.println("goOutofOFC");
	}
	@Test
	public void takeBreak() {
		System.out.println("takeBreak");
	}
	@BeforeSuite
	public void wakeUp() {
		System.out.println("wakeUp");
	}







}





