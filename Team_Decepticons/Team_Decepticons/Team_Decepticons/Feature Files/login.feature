
Feature: login Page
  User wants to login the page

  Scenario: login
    Given Launch the website as "https://demo.cyclos.org/ui/home"
    When User sends username 
    And User sends password
    Then Click login button

 