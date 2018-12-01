/*package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("enter the url")
	public void enterURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("enter the url")
	public void enterURL1() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("enter the username as (.*)")
	public void enterTheUsername(String username) {
	    driver.findElementById("username")
	    .sendKeys(username);
	}

	@Given("enter the password as (.*)")
	public void enterThePassword(String pwd) {
		 driver.findElementById("password")
		    .sendKeys(pwd);
	}
	@When("click login button")
	public void clickLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify login is success")
	public void verifyLoginIsSuccess() {
	   System.out.println("success");
	}
	@Then("verify login is failed")
	public void verifyLoginIsFail() {
	   System.out.println("failed");
	}
	
	
	
	
	
	
	
}














*/