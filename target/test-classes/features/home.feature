Feature: Booking an appointment 

Scenario: online booking website

Given user is on main page of website
When user clicks on book appointment button and lands on optInsurance page
And user clicks on I am paying myself button Appointment 
And user selects two days after today from appointment form
And user selects a doctor greater than 4.8 by clicking book button
Then user lands on profile creation page