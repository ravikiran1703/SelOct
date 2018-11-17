package learnAnnotations;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority = 5)
	public void met1() {
		System.out.println("met1");
	}
	@Test(priority = -2)
	public void met2() {
		System.out.println("met2");
	}
	@Test()
	public void met4() {
		System.out.println("met4");
	}
	@Test(priority = 7)
	public void met3() {
		System.out.println("met3");
	}



}
