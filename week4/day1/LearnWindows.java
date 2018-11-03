package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		driver.findElementByLinkText("GUEST CHECK-IN").click();
	    System.out.println(driver.getTitle());
	    //String window = driver.getWindowHandle();
	   // System.out.println(window);
	   
	    Set<String> allWindows = driver.getWindowHandles();
	    List<String> listOfWindow = new ArrayList<>();
	    listOfWindow.addAll(allWindows);
	    driver.switchTo().window(listOfWindow.get(1)); 
	    
	    
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    driver.findElementByLinkText("View Offer»").click();
	    Set<String> allWindows1 = driver.getWindowHandles();
	    List<String> listOfWindow1 = new ArrayList<>();
	    listOfWindow1.addAll(allWindows1);
	    driver.switchTo().window(listOfWindow1.get(3));
	    System.out.println(driver.getTitle());
	       
	}

}














