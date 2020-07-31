package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basefile.Testbase;

public class Homepage extends Testbase {
	@FindBy(xpath="//a//img[@class='img-responsive']")
	WebElement banner;
	@FindBy(xpath="//a[text()='Contact us']")
	WebElement contactuslink;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement loginlink;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean displaybanner()
	{
		return banner.isDisplayed();
	}
	public boolean displaycontactuslink()
	{
		return contactuslink.isDisplayed();
	}
	public boolean displayloginlink()
	{
		return loginlink.isDisplayed();
	}
	public void quit_browser()
	{
		driver.quit();
	}

}
