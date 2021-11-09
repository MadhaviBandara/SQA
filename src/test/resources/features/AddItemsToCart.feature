Feature: Test Add items to the cart and Obtain Invoice functionality

  #Background:
  Scenario:   Check all selected items are added successfully and obtained the invoice
    Given user logged to the system
    Then user navigates to item page
    And user selects all items and adds to cart
    Then cart table is successfully updated
    And user accepts the order summary
    And user checks shipping address
    And agreed to terms
    And user checks whether the agreement was accepted
    And user checks shipping option
    And user selects payment method
    And user confirms order
    When user checks whether payment is successful
    Then generates invoice as a pdf