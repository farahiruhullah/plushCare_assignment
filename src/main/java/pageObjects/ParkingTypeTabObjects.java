package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ParkingTypeTabObjects extends Base{
	
	public ParkingTypeTabObjects() {
		PageFactory.initElements(driver, this);
				
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/a[3]")
	private WebElement parkingTypeTab;

	public void clickOnparkingTypeTab() {
		parkingTypeTab.click();
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")
	private WebElement parkingTabText;
		
	public boolean visibleparkingTabText() {
		if(parkingTabText.isDisplayed())
			return true;
			else
			return false;
	}
	
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElement parkingStyleTab;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]")
	private WebElement nameBox;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/input[1]")
	private WebElement limitBox;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/input[1]")
	private WebElement priceBox;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/input[1]")
	private WebElement costBox;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[5]/div[1]/div[1]/input[1]")
	private WebElement taxesTab;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[6]/i[1]")
	private WebElement delelteIcone;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]/span[1]")
	private WebElement saveParking;
	
	public void clickOnparkingStyleTab() {
		parkingStyleTab.click();
	}
	
	public void clickOnnameBox() {
		nameBox.click();
		nameBox.sendKeys("xyz");
	}
	
	public void clickOnlimitBox() {
		limitBox.click();
		limitBox.clear();
	}
	
	public void clickOnpriceBox() {
		priceBox.click();
		priceBox.clear();
	}
	
	public void clickOncostBox() {
		costBox.click();
		costBox.clear();
	}
	
	public void clickOntaxesTab() {
		taxesTab.click();
		taxesTab.sendKeys("xyz");
	}
	public void clickOndelelteIcone() {
		delelteIcone.click();
	}
	public void clickOnsaveParkingbutton() {
		saveParking.click();
	}
	
	
	

}
