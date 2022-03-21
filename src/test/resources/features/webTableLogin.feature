Feature: User should be able to login using correct credentials


  Scenario: Positive login Scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user click to login button
    Then user should see url contains orders


  Scenario: Positive login Scenario
    Given user is on the login page of web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

  #implement this new step
  #create login method in WebTableLoginPage
  # this login method should have multiple different overloaded version