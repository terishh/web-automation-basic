Feature: Actions feature

  Background:
    Given I navigate to "Home" page
    And   I click "Dismiss button"

  @WIPx
  Scenario: Search for banana
    When I search for "banana"
    And  I click text "Banana Juice (1000ml)"
    Then I see "search results" with following data:
      | Name         | Banana Juice (1000ml)     |
      | Description  | Monkeys love it the most. |
      | Price        | 1.99                      |

  @WIPx
  Scenario: Create new Juice Shop user
    When I click "Account button"
    And  I click "Login button"
    And  I click "Not yet a customer"
    And  I set "Email field" to "foo@bar.com"
    And  I set "Password field" to "easyPassword123"
    And  I set "Password repeat field" to "easyPassword123"
    And  I click "Security question"
    And  I click text "Name of your favorite pet?"
    And  I set "Security answer" to "Mushu"
    And  I click "Registration button"
    Then I see text "Registration completed successfully."


  #  When I "create user" in "Registration" page with the following data:
  #    | Email             | foo@bar.com                |
  #    | Password          | easyPassword               |
  #    | Security question | Name of your favorite pet? |
  #    | Security answer   | Mushu                      |
  #  Then I log in with the following data:
  #    | Email    | foo@bar.com  |
  #    | Password | easyPassword |

  @WIP
  Scenario: Order an item
    When I log in with the following data:
      | Email    | demo |
      | Password | demo |
    #And I add "Juice Shop Artwork" to the basket
    #And I choose delivery address "Dummystreet 42"
    #And I choose delivery option "Fast Delivery"
    #And I choose payment card "1234567812345678"
    #And I checkout the order
    #Then I see "track order" in "order completion" page with following data:
    #  | Name      | Juice Shop Artwork |
    #  | Price     | 278.74             |
    #  | Delivered | false              |