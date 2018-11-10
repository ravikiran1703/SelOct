package util;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
    public static ExtentHtmlReporter html;
    public static ExtentReports extent;
    public ExtentTest test;
    public String testcaseName, testDesc, author, category;
    @BeforeSuite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true); 
		extent= new ExtentReports();
		extent.attachReporter(html); 
	}
    @BeforeMethod
    public void startTestCase() {
    	test = extent.createTest(testcaseName, testDesc);
	    test.assignAuthor(author);
	    test.assignCategory(category);
	}
	public void reportSteps(String status,String desc) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}
	}
	@AfterSuite
	public void stopResult() {
		 extent.flush();
	}
}








