Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Unsuccessful withdrawal to big amount
    Given I have deposited $200 in my wallet
    When I request $201
    Then should display alert1 "You don't have enough money"

  Scenario: Unsuccessful withdrawal amount $0
    Given I have deposited $200 in my wallet
    When I request $0
    Then should display alert2 "To low amount, try again"

  Scenario: Successful withdrawal amount $200
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed