package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdmethods.ProjectMethods;

public class TC001_CL extends ProjectMethods{
	@BeforeClass
	public void setData() {
		testcaseName ="TC001_CL";
		testDesc ="Create a new lead in leaftaps";
		author ="Gayatri";
		category = "Smoke";
	}
	@Test
	public void createLead() {
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TL");
		type(locateElement("id", "createLeadForm_firstName"), "koushik");
		type(locateElement("id", "createLeadForm_lastName"), "C");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
	}
}









