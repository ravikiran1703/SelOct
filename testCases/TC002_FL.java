package testCases;

import org.testng.annotations.Test;

import wdmethods.ProjectMethods;

public class TC002_FL extends ProjectMethods{

	@Test
	public void findLead() {
		login();
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TL");
		type(locateElement("id", "createLeadForm_firstName"), "koushik");
		type(locateElement("id", "createLeadForm_lastName"), "C");
		click(locateElement("name", "submitButton"));
	}
}









