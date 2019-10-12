Feature: TC001 Validating a Sign in functionality

  @smoke
  Scenario Outline: Validating sign in functionality
    Given I am on a home page
    And I enter valid "<email>" address
    And I click create an account button
    When I enter "<firstName>" and "<lastName>" and "<password>" and verify "<email>"
    And I enter "<firstName>" and "<lastName>" and "<address>" and "<city>" and "<state>" and "<zip>" and "<country>" and "<phone>"
    Then I click register and verify that account was created
  

    Examples: 
      | firstName | lastName | email                | password | address             | city     | state    | zip   | country       | phone      |
      | Bob       | White    | bobWhite09@gmail.com | password | 30-30 Morris street | Brooklyn | New York | 10233 | United States | 4456789898 |

      
      
      
      
      
      