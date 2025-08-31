package base;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.ExtentManager;
import utils.ScreenShotUtil;

public class BaseTest {
	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	protected ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeMethod
	public void setup(Method method)
	{
		//Reporting
		extent=ExtentManager.getInstance();
		test=extent.createTest(method.getName());
		playwright=Playwright.create();
		browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)
				.setSlowMo(1000));
		
		page=browser.newPage();
		page.setDefaultTimeout(15000);
		page.setDefaultNavigationTimeout(20000); 
	}
		
	@AfterMethod
		public void teardown(ITestResult result)
		{
			//Reporting logic
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.fail(result.getThrowable());
			
			String screenshotpath=ScreenShotUtil.takesScreenshot(page, result.getName());
			
			System.out.println("Screenshotpath is : "+screenshotpath);
			
			String projectpath=System.getProperty("user.dir");
			
			
			String absolutepath=projectpath+"/"+screenshotpath;
			System.out.println(absolutepath);
			
			//test.addScreenCaptureFromBase64String(absolutepath,"screenshot");
			test.addScreenCaptureFromPath(absolutepath,"screenshot");
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.pass("Test passed");
		}
		else
		{
			test.skip("Test skipped");
		}
		extent.flush();
		//Browser clean up
		if(browser!=null) browser.close();
		if(playwright!=null) playwright.close();
		}
		
	}
	
	
	


