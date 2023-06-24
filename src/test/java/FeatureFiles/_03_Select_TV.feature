Feature:Select the TV from All menu

  Scenario: Select the TV by filtr
    Given  Open website Amazon
    When Confirm website Amazon
    Then Click to the All,select Electronics and click Television & Video
    |mainAll|
    And Select TV from the department section,select LED & LCD TV and select SAMSUNG from the Featured Brands section
    Then Send min and max price press Go then select 4K and 2022 from Modul year
    And Select Samsung M8, check discount price and add to card, then delete product






