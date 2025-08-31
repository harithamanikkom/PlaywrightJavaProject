package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LoginTest extends BaseTest{

	
	 @Test
	  public void test() {
	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",new Page.NavigateOptions().setTimeout(15000));
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("ControlOrMeta+-");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("CapsLock");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("CapsLock");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("CapsLock");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("A");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("CapsLock");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Recruitment")).click();
	    //assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard"))).isVisible();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard")).click();
	  }
	}

