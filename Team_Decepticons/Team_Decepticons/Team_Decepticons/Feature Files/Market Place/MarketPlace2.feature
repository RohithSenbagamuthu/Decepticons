
Feature: MarketPlace Handling the favorite option

Background:
       Given Navigate to the login page
       When Enters the username and password
       When Clicks the Login button

  Scenario: 
    Given Navigate to the Market Place Page
    When Click on the Advertisement option
    And Click show more filter
    And Send Keyword in the keyword field
    And Click the favorite checkbox
    And enter minimum and maximum price
    And Click Show Advertisement Option
    And Favorites are displayed
    
