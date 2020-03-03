Feature: Test Example

  Background:
    Given I navigate to "Home" page
    And   I click "Dismiss button"

  @WIPx
  Scenario: Search for Apple
    When  I "search" with following data:
      | Keyword |
      | Apple   |
    Then  I see "Search Results" with the following data:
      | Title                |
      | Apple Pomace         |
      | Apple Juice (1000ml) |

  @WIPx
  Scenario: Go to Login page
    When  I click "Account button"
    And   I click "Login button"
    Then  I see the following fields:
      | Email field         |
      | Password field      |
      | Login button        |
      | Google Login button |

  @WIPx
  Scenario: Go to login page
    When I navigate to "Login" page
    And  I "login" with following data:
      | Email | Password |
      | demo  | demo     |

    And  I click "Account button"
    Then I see the following fields:
      | Orders & Payment button   |
      | Privacy & Security button |
      | Logout Button             |
    And I see "User Profile button" with the following data:
      | Email |
      | demo  |
