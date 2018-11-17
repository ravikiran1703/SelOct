package learnAnnotations;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority=4)/*(enabled = false) */
	public void creteLead() { 
		System.out.println("creteLead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"creteLead"},priority=1/*, alwaysRun = true*/)   
	public void editLead() {
		System.out.println("editLead");
	} 
	@Test(priority=3, dependsOnMethods="creteLead") 
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	@Test(priority=2)
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	
}
