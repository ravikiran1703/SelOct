package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAUI2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://www.flipkart.com/");
		//Enter the UserName
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement electronis = driver.findElementByXPath("//span[text()='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronis).perform();
		Thread.sleep(2000);
		WebElement apple = driver.findElementByLinkText("Apple");
		builder.click(apple).perform();
		
		
	}

}


















