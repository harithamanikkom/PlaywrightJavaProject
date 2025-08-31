package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private final Page page;
	private String timelink="oxd-text oxd-text--span oxd-main-menu-item--name";

	
	public  HomePage(Page page)
	{
		this.page=page;
	}
	
	public void clickTimeLink()
	{
		page.locator(timelink).click();
	}
}
