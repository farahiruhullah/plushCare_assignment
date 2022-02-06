package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class BookDr extends Base{
	
	public BookDr () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[2]/div[2]/div[1]/div[3]/button[1]")
	private WebElement bookDoctor;
	
	public void clickBookDoctor() {
		bookDoctor.click();
	}

}
