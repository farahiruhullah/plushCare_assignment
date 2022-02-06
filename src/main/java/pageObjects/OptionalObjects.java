package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class OptionalObjects extends Base{


	public OptionalObjects() {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[@class='primary-pair-button css-1ti498o e12r4e830']")
	private WebElement payMyself;
	
	public void clickOnPaymyself() {
		payMyself.click();
	}

}