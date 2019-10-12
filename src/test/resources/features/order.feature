
Feature: Placing and Validating order

Background:
       Given I am on a home page
       When I enter userName and Password and click Login
 

    @smoke
      Scenario: Validating purchase item functionality
      Given I am on a "http://automationpractice.com/index.php?id_category=8&controller=category" page 
      And I add to card first availible dress and click proceed to checkout
      When I verify that item is avalible in card
      And I click next and choose delivery same as billing address
      And I click next and click Terms of service and click proceed to checkout
      And I choose pay by bank wire and click confirm 
      Then I click Back to order and verify order details