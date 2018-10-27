package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args)  {
		//tell where is Chrome driver available
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//Enter the UserName
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login 
		driver.findElementByClassName("decorativeSubmit").click();
		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source = driver.findElementById("createLeadForm_firstName");
		//create object for select class
		Select se = new Select(source);
		//select a option from dropdown 
		//se.selectByIndex(2);
		//se.selectByValue("LEAD_PARTNER");
		//se.selectByVisibleText("Employee");
		//print all the values from dropdown
		List<WebElement> allOptions = se.getOptions(); 
		int size = allOptions.size();
		se.selectByIndex(size-1);
		for (WebElement eachOption : allOptions) {
			 System.out.println(eachOption.getText()); 
		}
	}

}




















