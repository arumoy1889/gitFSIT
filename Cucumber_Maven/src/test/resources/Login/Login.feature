@Login
Feature: Validate Login
  1. Admin Login
  2. Linda Login
  3. Negative Login
  
  
Background:
    Given I am able to navigate to Login page


  @TC01
  Scenario Outline: Admin Login & Linda Login
    When I update username as "<username>"
    And I update password as "<password>"
    And I click on the login button
    Then I should see the username as "<name>"

Examples:
|username      |password      |name         		|
|linda.anderson|linda.anderson|Welcome Linda		|
|linda.anderson|linda.anderson|Welcome Linda		|


  @TC02
  Scenario: negative Login
    When I update username as "sunil"
    And I update password as "sunil"
    And I click on the login button
    Then I should see the mesage "Invalid credentials"
