Feature: feature is to test Login Functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to homepage
