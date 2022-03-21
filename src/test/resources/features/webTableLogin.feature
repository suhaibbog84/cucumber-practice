Feature: User should be able to login using correct credentials

  Background: user is on the login page
    Given user is on the login page of web table app

  Scenario: Positive login Scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click to login button
    Then user should see url contains orders


  Scenario: Positive login Scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

  @wip
  Scenario: User should be able to see all 12 months in
  months
  dropdown
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders

Feature: Web table user order feature

  Scenario: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity "2"
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table
