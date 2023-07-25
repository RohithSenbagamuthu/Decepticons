
Feature: Sending New Message
  User wants to sending a new message
  
 Background: User wants to login and clicks the message icon
       Given navigate to the login page
       When enters the username and password
       When Clicks the login button
       When click the message icon
       When click new message in rightside

  @User
  Scenario: sending a new message as user
    Given user navigate to the new message field
    When Select sendTo option as user
    And Enter To user name
    And enter subject in the subject field
    And Write description in the description box
    Then Click the send button
    

  @Administration
  Scenario: Sending a new message as Administrationl
    Given user navigate to the new message field
    When Select sendTo option as administration
    And slect the category field
    And user should enter subject in the subject field
    And User Writes description in the description box
    Then Clicks the send button
   
  