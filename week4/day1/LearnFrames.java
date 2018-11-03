package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://jqueryui.com/selectable/");
		//Enter the UserName
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//switch to frame
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
	    driver.switchTo().frame(eleFrame);
	    driver.findElementByXPath("//li[text()='Item 3']").click();
	    driver.switchTo().defaultContent();
	    driver.findElementByLinkText("Download").click();
	    driver.switchTo().parentFrame();
	
	
	
	
	}

}














