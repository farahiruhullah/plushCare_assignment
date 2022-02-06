package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookDr;
import pageObjects.DatePickerObject;
import pageObjects.HomePageObject;
import pageObjects.OptionalObjects;
import pageObjects.ProfilePageObject;
import utilities.UtilityClass;


public class BookingAppointment extends Base{
	HomePageObject homePageObject= new HomePageObject();
	DatePickerObject datePickerObject= new DatePickerObject();
	OptionalObjects optionalObject= new OptionalObjects(); 
	BookDr bookDr = new BookDr();
	ProfilePageObject profilePageObject= new ProfilePageObject();
	
	@Given("^user is on main page of website$")
	public void user_is_on_main_page_of_website() {
		String actualPageTitle= driver.getTitle();
		String expectedPagetitle = "Quality Online Health & Medical Provider | PlushCare";
		Assert.assertEquals(expectedPagetitle,actualPageTitle);
		logger.info("user is on the homepage of the website");
		
	}
	
	@When("^user clicks on book appointment button and lands on optInsurance page$")
	public void user_clicks_on_book_appointment_button_and_lands_on_optInsurance_page() {
		homePageObject.clickOnBookAppointment();
		logger.info("user clicked on book appointment button");
		UtilityClass.takeScreenShot();
	}
	
	@And("^user clicks on I am paying myself button Appointment$")
	public void user_clicks_on_I_am_paying_myself_button_Appointment() {
		optionalObject.clickOnPaymyself();
		logger.info("user clicked on I am paying myself button");
		UtilityClass.takeScreenShot();
	}
	@And("^user selects two days after today from appointment form$")
	public void user_selects_two_days_after_today_from_appointment_form() {
		datePickerObject.clickOnPickDate();
		//datePickerObject.clickOntwoDayDate();
		datePickerObject.clickOntwoDayDate();
		logger.info("user selected appointment date in two days");
		UtilityClass.takeScreenShot();
	}
	@And("^user selects a doctor greater than 4.8 by clicking book button$")
	public void user_selects_a_doctor_greater_than_4_8_by_clicking_book_button() {
		bookDr.clickBookDoctor();
		logger.info("user selected and clicked book for a doctor having more than 4.6 rating");
			
	}
	@Then("^user lands on profile creation page$")
	public void user_lands_on_profile_creation_page() {
		Assert.assertTrue(profilePageObject.profileTextIsPresent());
		logger.info("user sees the create profile page");
		UtilityClass.takeScreenShot();
		
	}
	
	

}
