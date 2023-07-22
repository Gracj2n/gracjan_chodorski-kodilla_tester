Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit

    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit

    Given I have deposited $500 in my wallet
    When I request $500
    Then $500 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit

    Given I have deposited $150 in my wallet
    When I request $0
    Then $0 should be dispensed