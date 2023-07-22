Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance

    Given there is $<walletBalance> in my wallet
    When I withdraw $<withdrawValue>
    Then $<withdrawValue> should not be dispensed
    And I should be told that I don't have enough money in my wallet
    Examples:
    |walletBalance|withdrawValue|
    |100          |200          |
    |0            |1            |
    |100          |500          |

