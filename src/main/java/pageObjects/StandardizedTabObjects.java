package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class StandardizedTabObjects extends Base{
	
	public StandardizedTabObjects() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[2]/a[2]")
	private WebElement standardizedTab;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement field1;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/i[1]")
	private WebElement field1Delete;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement field2;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
	private WebElement field2Delete;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")
	private WebElement field3;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/i[1]")
	private WebElement field3Delete;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]/span[1]")
	private WebElement saveChanges;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h4[1]")
	private WebElement customizedInventoryFieldText;
	
	public boolean visibleCustomizedInventoryFieldText() {
		if(customizedInventoryFieldText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickStandardizedTab() {
		standardizedTab.click();
	}
	
	public void clickfield1() {
		field1.click();
	}
	
	public void clickfield1Delete() {
		field1Delete.click();
	}
	public void clickfield2() {
		field2.click();
	}
	public void clickfield2Delete() {
		field2Delete.click();
	}
	public void clickfield3() {
		field3.click();
	}
	public void clickfield3Delete() {
		field3Delete.click();
	}
	public void clicksaveChanges() {
		saveChanges.click();
	}

}

