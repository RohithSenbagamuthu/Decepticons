
Feature: AccountInformation2
  User must have already made the payments
@payment	
  Scenario: Search payments
    When User should click the Show  Filter button
    And Select pick from your contact list on the user filter and select a contact
    And Click the peroid menu and select any one option
 @load
  Scenario: View payment details
    And Click any one from Member Account
    Then In transfer details window view single user payment details
 @load2 
	Scenario: Print payment details
		And User should click the Member Account 
    Then User should click the print button

