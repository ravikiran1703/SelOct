package wdmethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import util.Reporter;

public class SeMethods extends Reporter implements WdMethods {
	public RemoteWebDriver driver;
	int i =1;
	@Override
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The browser "+browser+" launched successfully"); 
		takeSnap();
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": return driver.findElementById(locValue);
			case "name": return driver.findElementByName(locValue);	
			case "xpath": return driver.findElementByXPath(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "link": return driver.findElementByLinkText(locValue);
			}
		} catch (NoSuchElementException e) {
			System.out.println("The element is not found");
		} catch (WebDriverException e) {
			System.out.println("Unknown Exception occured");
		} 
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			//System.out.println("The data "+data+" enter successfully");
		    reportSteps("pass", "The data "+data+" enter successfully");
		} catch (WebDriverException e) {
			//System.out.println("The data "+data+" not enter successfully");
		   reportSteps("fail", "The data "+data+" not enter successfully");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The element "+ele+" clicked");
		   reportSteps("pass", "The element "+ele+" clicked");
		} catch (Exception e) {
			reportSteps("fail", "The element "+ele+" not clicked");
		} finally {
		takeSnap();
		}
	}

	public void clickWithOutSnap(WebElement ele) {
		ele.click();
		System.out.println("The element "+ele+" clicked"); 
	}

	@Override
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value, String sel) {
		Select dd = new Select(ele);
		if(sel.equalsIgnoreCase("visible")) {
			dd.selectByVisibleText(value);
		}else if (sel.equalsIgnoreCase("value")) {
			dd.selectByValue(value);
		} else if (sel.equalsIgnoreCase("index")) {
			dd.selectByIndex(Integer.parseInt(value)); 
		}
	}

	/*@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {

	}*/

	@Override
	public boolean verifyTitle(String expectedTitle) {
		boolean bReturn = false;
		String title = driver.getTitle();
		if(title.equals(expectedTitle)) {
			System.out.println("The Title is matched with "+expectedTitle);
			bReturn=true;
		} else {
			System.out.println("The Title is not matched with "+expectedTitle);
		}
		return bReturn;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
       if(ele.getText().equals(expectedText)) {
    	   System.out.println("The text matched");
       } else {
    	   System.out.println("The text not matched");
       }
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText)) {
	    	   System.out.println("The text matched");
	       } else {
	    	   System.out.println("The text not matched");
	       }

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
         if(ele.getAttribute(attribute).equals(value)) {
        	 System.out.println("The attribute text matched");
         }else {
        	 System.out.println("The attribute text not matched");
         }
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value)) {
       	 System.out.println("The attribute text matched");
        }else {
       	 System.out.println("The attribute text not matched");
        }

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
      Set<String> allWindows = driver.getWindowHandles();
      List<String> list = new ArrayList<>();
      list.addAll(allWindows);
      driver.switchTo().window(list.get(index));
	}

	@Override
	public void switchToFrame(WebElement ele) {
       driver.switchTo().frame(ele);
	}

	@Override
	public void acceptAlert() {
     try {
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
	} catch (NoAlertPresentException e) {
		System.out.println("Alert not present");
	} 
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
        
		return null;
	}

	@Override
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, dec);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {
        driver.close();
	}

	@Override
	public void closeAllBrowsers() {
         driver.quit();
	}

}
