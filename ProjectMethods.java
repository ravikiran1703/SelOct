package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods{
	@Parameters({"browser", "url"})
	@BeforeMethod(groups = "config")
	public void login(String bro, String url) {
		startApp(bro, url);
		WebElement eleUsername = locateElement("id", "username");
		type(eleUsername, "DemoSalesManager");
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin); 
	}
	@AfterMethod(groups = "config")
	public void tearDown() {
		closeBrowser();
	}

}


