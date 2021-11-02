Feature: Test the login functionality

  Scenario: Check whether user logs in successfully
    Given navigated to the login page
    And login page title validated
    And login image validated
    When login credentials provided
    Then navigate to profile