package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAUI {

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
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item5)
		.click(item7).keyUp(Keys.CONTROL).build().perform();
		
	}

}


















