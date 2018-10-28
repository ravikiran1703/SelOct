package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFindElements {

	public static void main(String[] args) throws IOException  {
		//tell where is Chrome driver available
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");		
		//Launch the Browser - chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MYS",Keys.TAB);
		WebElement check = driver.findElementById("chkSelectDateOnly");
		if (check.isSelected()) {
			check.click();
		}		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachRow = rows.get(i);
			List<WebElement> allCell = eachRow.findElements(By.tagName("td"));
			//System.out.println(allCell.size());
			System.out.println(allCell.get(1).getText());
		}
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img.png");
		FileUtils.copyFile(src, desc);
		
	}

}




















