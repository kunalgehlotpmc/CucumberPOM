package stepdefination;

import org.testng.Assert;

import basefile.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webpages.Homepage;

public class Homepagestep extends Testbase


{
	Homepage homepage;
	
	@Given ("^User is at home page$")
	public void user_at_homepage() throws Exception
	{
		initialization();
	}
	@Then ("^Banner is displayed$")
	public void banner_is_displayed()
	{
		homepage = new Homepage();
		boolean b = homepage.displaybanner();
		Assert.assertTrue(b);
		
	}
	@Then ("^Contact us link is displayed$")
	public void contact_us_is_displayed()
	{
		homepage = new Homepage();
		boolean b = homepage.displaycontactuslink();
		Assert.assertTrue(b);
	}
	@Then ("^Login link is displayed$")
	public void login_link()
	{
		homepage = new Homepage();
		boolean b = homepage.displayloginlink();
		Assert.assertTrue(b);
	}
	@Then("^user quits browser$")
	public void user_quits_browser() throws Throwable {
	    driver.quit();
	}

}
