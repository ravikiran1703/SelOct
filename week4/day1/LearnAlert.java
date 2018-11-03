package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://www.irctc.co.in/");
		//Enter the UserName
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementById("loginbutton").click();
		driver.switchTo().alert().accept();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.alertIsPresent()).accept();
        System.out.println(driver.getTitle());
	}

}














