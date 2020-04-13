Feature: Basic Actions

  Background:
    Given I navigate to "Home" page
    And   I click "Dismiss button"
    And   I click "Me want it"

  Scenario: Search for banana
    When I search for "banana"
    And  I click text "Banana Juice (1000ml)"
    Then I see "search results" with following data:
      | Name         | Banana Juice (1000ml)     |
      | Description  | Monkeys love it the most. |
      | Price        | 1.99                      |

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

  Scenario: Order an item
    When I click "Account button"
    And  I click "Login button"
    Then I "log in" with following data:
      | Email    | demo |
      | Password | demo |
    When I search for "Juice Shop Artwork"
    And  I click "Add to basket"
    And  I click "Shopping cart button"
    Then I see text "Juice Shop Artwork"
    When I click "Checkout button"
    Then I see text "Dummystreet 42, Mocktown, Testilvania, 12345"
    When I click "Tim tester"
    And  I click "Continue"
    Then I see text "Choose a delivery speed"
    When I click "Standard Delivery"
    And  I click "Continue"
    Then I see text "My Payment Options"
    When I click "Tim tester"
    And  I click "Continue"
    Then I see text "Order Summary"
    When I click "Place your order and pay"
    Then I see text "Thank you for your purchase!"
