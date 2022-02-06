package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//body/div[5]/div[2]/div[1]/div[1]/div[1]/a[1]")
	private WebElement bookAppointment;
	
	public void clickOnBookAppointment() {
		bookAppointment.click();
	}
	
	

}
