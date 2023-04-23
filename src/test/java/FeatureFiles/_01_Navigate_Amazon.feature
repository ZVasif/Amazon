Feature: Navigate to Amazon

  Scenario: Go to the main page

    Given Open website Amazon
    When Confirm website Amazon
    And Create new account and sing in
    Then Click to the All and select computer, then search samsung
    And Select Samsung tablet, check discount price and add to card, then delete product