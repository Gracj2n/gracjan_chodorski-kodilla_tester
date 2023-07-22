Feature: Display balance

  Scenario Outline: User checks the balance of their wallet

    Given there is $<walletBalance> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $<expectedWalletBalance>
    Examples:
    |walletBalance|expectedWalletBalance|
    |100          |100                  |
    |0            |0                    |
    |99999999     |99999999             |
