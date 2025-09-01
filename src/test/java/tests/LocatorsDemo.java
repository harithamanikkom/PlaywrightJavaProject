package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LocatorsDemo extends BaseTest {

	@Test
	public void testallLocators() {

		page.navigate(" https://trytestingthis.netlify.app/");

		// using ID attribute
		page.locator("#fname").fill("Haritha");
		// page.locator("input[name='fname']").fill("Sony");

		// using name attribute
		page.locator("input[name='lname']").fill("Manikkom");

		// select radio button using type ,value and index
		page.locator("input[value='male']").check();
		page.locator("input[type='radio']").nth(1).check();

		// select drop downs
		page.locator("select#option").selectOption("Option 2");
		// page.locator("#option").selectOption("Option 2");

		// Checkboxes
		page.locator("input[type='checkbox'][value='Option 3']").check();

		// page.locator("input[name='option1']").check();
		// page.getByLabel("Option 3").check();
		
		
	//  Checkbox using name
		//page.locator("input[name='option1']").check(); // Option 1
		//page.locator("input[name='option2']").check(); // Option 2

		//  XPath (avoid if possible, but sometimes needed)

page.locator("//input[@type='date']").fill("2025-09-01");

page.getByText("Click me").click();
page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		
		 page.pause();
	}

}
