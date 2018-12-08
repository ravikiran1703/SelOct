package challenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagers {
	public static void main(String[] args) {
		/*	// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
compile group: 'io.github.bonigarcia', name: 'webdrivermanager', version: '3.0.0'*/
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementById("loginbutton").click();
	}


	
	
	
	
	
	
	
	
	
	
}
