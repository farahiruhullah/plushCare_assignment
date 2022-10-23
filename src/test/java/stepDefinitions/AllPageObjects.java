package stepDefinitions;

import core.Base;
import pageObjects.ParkingStatusObjects;
import pageObjects.ParkingTypeTabObjects;
import pageObjects.StandardizedTabObjects;
import pageObjects.StatusesTabObjects;


/**
 * This class is linked to the feature file where we use the Ghrekin format.
 * We could have individual classes for each object class, but for the purpose of the exercise we keep one.
 * */
public class AllPageObjects extends Base{
	ParkingTypeTabObjects homePageObject= new ParkingTypeTabObjects();
	ParkingStatusObjects optionalObject= new ParkingStatusObjects(); 
	StandardizedTabObjects profilePageObject= new StandardizedTabObjects();
	StatusesTabObjects statusObjects= new StatusesTabObjects();
	
	

}
