Feature: Demo

#  Given,When,Then,And,But

  @chrome
  Scenario: Login
    Given User is on login page
    When User enter correct credentials
    Then User should be on dashboard page
    And User should see all the required details

  @chrome
  Scenario: Login
    Given User is on login page
    When User enter correct credentials
    Then User should be on dashboard page
    And User should see all the required details

  @chrome
  Scenario: Login
    Given User is on login page
    When User enter correct credentials
    Then User should be on dashboard page
    And User should see all the required details

  @edge
  Scenario: Logout
    Given User is Click on hamberger menu
    When User Select logout option
    Then User shoud be on login page

  @edge
  Scenario: Logout
    Given User is Click on hamberger menu
    When User Select logout option
    Then User shoud be on login page
  @edge
  Scenario: Logout
    Given User is Click on hamberger menu
    When User Select logout option
    Then User shoud be on login page
  @edge
  Scenario: Logout
    Given User is Click on hamberger menu
    When User Select logout option
    Then User shoud be on login page


