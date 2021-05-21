Feature: feature to test Login functionality
  Scenario Outline: Validate the working of Login functionality
    Given user is on login page "https://opensource-demo.orangehrmlive.com/"
    When user enter "<user_name>" and "<password>"
    And click on login button
    Then user navigate to home page


    Examples:
    |user_name | password |
    |Admin     | admin123 |
    |admin     | admin987 |
    |Admin     | admin543 |

