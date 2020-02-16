Feature: Test Example

  Scenario: Open Home Page
    Given I navigate to "Home" page
    When I search for "Chiffon Dress"
    Then I see "results list" with the following data:
      | Printed Chiffon Dress |
      | Printed Summer Dress  |
