Feature: AccountInformation1
  User should have valid login credentials
Background:
	 Given launch the Cyclos Website
	  And User should enter the username and password to login 
    And User should click Submit button
    And  User should click Banking Menu
 
  Scenario: user should login with valid account and view Account Summary
    Then User should click Member Account
  @tag3  
	Scenario: View current balance
		Then Get the Current balance
		
	Scenario: user should login with valid account and view payment history
		Then Click on Notification Link
		
	Scenario: Print and export payment
		And Click any one of the Account transaction 
		Then In transfer details window click on print button
  