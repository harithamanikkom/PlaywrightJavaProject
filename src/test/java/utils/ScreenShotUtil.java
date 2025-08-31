package utils;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class ScreenShotUtil {
	
	public static  String takesScreenshot(Page page,String testName)
	{
		String timestamp=new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date());
		
		String path="test-output/screenshots/"+testName+"_"+timestamp+".jpg";
		
		
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
		return path;
	}

}
