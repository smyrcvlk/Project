Feature: Order history
  Background:
  Scenario: Order  an item
    And Click on   T-SHIRTS
    And Click on list view
    And Click on Add to cart button
    And Click on proceed to checkout button
    And Click on proceed to checout button for sigin
    And Click on proceed to checout button for adress
    And Click on terms of service
    And Click on proceed to checout button for shipping
    And Click on bank wire payment
    Then Click on I confirm my order button

    Scenario: Order history
      And click on your name
      And click on order history and details



