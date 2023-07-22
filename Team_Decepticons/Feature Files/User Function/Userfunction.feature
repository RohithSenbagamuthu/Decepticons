


Feature: UserFunction
  @tag1
  Scenario: UpdateProfile
    Given User must click on edit button
    And click on email text field
    When enter valid email in text field
    Then click on name field in address
    And enter correct name in name field
    When User click on city field 
    And enter the cityname
    Then click on save button
    
    @tag2
     Scenario: Add Multiple Address
Given User should click on edit button
And click on Add address button
Then click on name text field
And enter the valid name
Then click on Address line1 text field
And enter the valid Address line1
Then Click on city text field
And enter the valid city
And Click on Zipcode text field
And enter the valid Zipcode
Then click on the save button

  @tag3
  Scenario: Add MultiplePhones
    Given User click on edit button
    And click on Add mobiles button
    When click the mobile phone name text field
    And Enter the valid mobile phone name
    When click the valid mobile phone number text field
    And Enter the valid mobile phone number
    Then click on Add Mobile phones button

@tag4
Scenario: Manage passwords
Given Click on Profile button
And Click on password button
Then click on Change button
And Click on Old password text field
Then enter the valid password in password text field
And Click on new password text field
Then enter the new valid password in new password text field
And Click on Submit button

@tag5
Scenario: Notificatin preferences
Given Click on the Profile button
Then Click on notification button
And Click on unread checkbox

 
@tag6
Scenario: Manage contacts
Given Click on profile button
Then Click on contacts button
And Click on first profile in list view

 
    
    

  