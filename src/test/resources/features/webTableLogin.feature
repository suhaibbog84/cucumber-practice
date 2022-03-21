Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive login Scenario
    Given user is on the login page of web table app
    When user enters username "Tester"
    And user enters password "test"
    And user click to login button
    Then user should see url contains orders