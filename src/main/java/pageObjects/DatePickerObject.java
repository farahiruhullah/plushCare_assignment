package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DatePickerObject extends Base {

	public DatePickerObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='date-picker-input']")
	private WebElement pickDate;

	public void clickOnPickDate() {
		pickDate.click();

	}

	public void clickOntwoDayDate() {
		DateFormat dateFormat = new SimpleDateFormat("d");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 2);
		String newDate = dateFormat.format(cal.getTime());
		System.out.println(newDate);
			
			
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@aria-disabled='false']"));

		for (WebElement date : allDates) {
			String dt = date.getText();
			if (dt.equals(newDate)) {
				date.click();
				break;
				}
			}
		}
			

		
	
		
	

}
