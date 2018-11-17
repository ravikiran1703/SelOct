package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdmethods.ProjectMethods;

public class TC001_CL extends ProjectMethods{
	@BeforeClass(groups = "config")
	public void setData() {
		testcaseName ="TC001_CL";
		testDesc ="Create a new lead in leaftaps";
		author ="Gayatri";
		category = "Smoke";
	}
//	@Test(invocationCount = 2, invocationTimeOut = 2000)
//	@Test(timeOut = 2000)
//	@Test(priority =2)
//	@Test(groups = "test.reg", dependsOnGroups = "test.sample")
	@Test( dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName) {
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		/*type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));  */
		
	}
	@DataProvider(name = "fetchData", indices= {0, 1-2}) 
	public String[][] getData() {
		String[][] data = new String[3][3];
		  data[0][0] = "first";
		  data[0][1] = "Gopi";
		  data[0][2] = "J";
		  
		  data[1][0] = "second";
		  data[1][1] = "Gayatri";
		  data[1][2] = "K";
		  
		  data[2][0] = "third";
		  data[2][1] = "Gayatri";
		  data[2][2] = "K";
		 return data;  
	}
	
}









