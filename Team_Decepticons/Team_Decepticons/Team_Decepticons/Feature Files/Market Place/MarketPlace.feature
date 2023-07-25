
Feature: Sends a rich text and schedule an advertisement

Background:
       Given Navigate to the login page
       When Enters the username and password
       When Clicks the Login button
      
Scenario: 
   Given navigate to the Marketplace page
    When Click the MyAdvertisement option
    And click the add new option on the top right
    And Enters the name in the name field
    And Select the any one of the activity in category field
    And Select fromDate in the publication period
    And Select ToDate in the Publication period
    And types the text in the description field

  