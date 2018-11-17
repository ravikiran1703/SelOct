package learnAnnotations;

import org.testng.annotations.Test;

public class LearnDepends {
	@Test(dependsOnMethods = "learnAnnotations.Pri.met2", 
			alwaysRun = true)
	public void met1() {
		System.out.println("met1");
	}
	@Test()
	public void met2() {
		System.out.println("met2");
		throw new RuntimeException();
	}
	@Test()
	public void met4() {
		System.out.println("met4");
	}




}


