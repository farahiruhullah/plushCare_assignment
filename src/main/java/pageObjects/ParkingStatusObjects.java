package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ParkingStatusObjects extends Base{


	public ParkingStatusObjects() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/h4[1]")
	private WebElement parkingStatusTabText;
		
	public boolean visibleparkingStatusTabText() {
		if(parkingStatusTabText.isDisplayed())
			return true;
			else
			return false;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement preAllocatedBox;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement availableBox;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	private WebElement pendingBox;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement allocatedBox;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]")
	private WebElement parkingStatusButton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	private WebElement updateButton;
	
	
	
	public void clickOnparkingStatusTabText() {
		parkingStatusTabText.click();
	}
	
	public void clickOnavailableBox() {
		availableBox.click();
		availableBox.clear();
		availableBox.sendKeys("xyz");
	}
	
	public void clickOnpendingBox() {
		pendingBox.click();
		availableBox.clear();
		availableBox.sendKeys("xyz");
	}
	
	public void clickOnallocatedBox() {
		allocatedBox.click();
		availableBox.clear();
		availableBox.sendKeys("xyz");
	}
	
	public void clickOnparkingStatusButton() {
		parkingStatusButton.click();
	}
	
	public void clickOnupdateButton() {
		updateButton.click();
	}
	
	

}