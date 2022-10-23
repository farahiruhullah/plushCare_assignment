package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class StatusesTabObjects extends Base{
	
	public StatusesTabObjects () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	private WebElement statusTab;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]")
	private WebElement statusAvailable;
	
	@FindBy(xpath="//body/div[@id='container']/div[@id='content']/div[@id='contract-settings']/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/i[1]")
	private WebElement statusDelete;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/select[1]")
	private WebElement statusPrepping;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[3]/i[1]")
	private WebElement preppingDelete;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/select[1]")
	private WebElement statusPending;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/select[1]")
	private WebElement statusOffer;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/select[1]")
	private WebElement statusAccepted;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[2]")
	private WebElement statusFirm;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[2]/select[1]")
	private WebElement statusCompleted;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[8]/div[2]/select[1]")
	private WebElement statusCourtesyHold;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[14]/div[2]/select[1]")
	private WebElement statusEnterNewStatus;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[14]/div[3]/i[1]")
	private WebElement statusDeleteEnterNewStatus;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[12]/div[3]/i[1]")
	private WebElement statusDeleteSpecialInsider;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[3]/i[1]")
	private WebElement statusDeleteReservation;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[2]/select[1]")
	private WebElement statusReservation;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]")
	private WebElement statusInventoryStatus;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div[2]/select[1]")
	private WebElement statusSaleRepOnHold;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[10]/div[2]")
	private WebElement statusUnderReservation;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[11]/div[2]")
	private WebElement statusDeveloperHold;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[12]/div[2]/select[1]")
	private WebElement statusSpecialInsider;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/h4[1]")
	private WebElement inventoryStatusText;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]/i[1]")
	private WebElement statusUpdate;
	
	public void clickStatusTab() {
		statusTab.click();
	}
	
	public void clickStatusAvailable() {
		statusAvailable.click();
	}
	public void clickStatusDelete() {
		statusDelete.click();
	}
	public void clickStatusPrepping() {
		statusPrepping.click();
	}
	public void clickPreppingDelete() {
		preppingDelete.click();
	}
	public void clickStatusPending() {
		statusPending.click();
	}
	public void clickStatusOffer() {
		statusOffer.click();
	}
	public void clickStatusAccepted() {
		statusAccepted.click();
	}
	public void clickStatusFirm() {
		statusFirm.click();
	}
	public void clickStatusCompleted() {
		statusCompleted.click();
	}
	public void clickStatusCourtesyHold() {
		statusCourtesyHold.click();
	}
	public void clickStatusEnterNewStatus() {
		statusEnterNewStatus.click();
	}
	public void clickStatusDeleteEnterNewStatus() {
		statusDeleteEnterNewStatus.click();
	}
	public void clickStatusDeleteSpecialInsider() {
		statusDeleteSpecialInsider.click();
	}
	public void clickStatusDeleteReservation() {
		statusDeleteReservation.click();
	}
	public void clickStatusReservation() {
		statusReservation.click();
	}
	public void clickStatusInventoryStatus() {
		statusInventoryStatus.click();
	}
	public void clickStatusSaleRepOnHold() {
		statusSaleRepOnHold.click();
	}
	public void clickStatusUnderReservation() {
		statusUnderReservation.click();
	}
	public void clickStatusDeveloperHold() {
		statusDeveloperHold.click();
	}
	public void clickStatusSpecialInsider() {
		statusSpecialInsider.click();
	}
	public void clickInventoryStatusText() {
		inventoryStatusText.click();
	}
	public void clickStatusUpdate() {
		statusUpdate.click();
	}
	

}
