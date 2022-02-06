package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ProfilePageObject extends Base{
	public ProfilePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//h1[contains(text(),'Create profile.')]")
	private WebElement profileText;
	
	public boolean profileTextIsPresent() {
		if(profileText.isDisplayed())
			return true;
		else
			return false;
		
	}

}

