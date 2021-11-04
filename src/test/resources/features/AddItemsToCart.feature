Feature: Test Add items to the cart and Obtain Invoice functionality

  #Background:
  Scenario:   Check all selected items are added successfully
    Given user logged in
    And page validated
    When all items are selected
    Then proceed to checkout
    And Obtain invoice

#  Scenario: Checkout and Obtain Invoice
#    Given cart is validated
#    And summary is accepted
#    And address checked
#    And agreed to terms
#    And shipping checked
#    And payment selected
#    When user finished adding all items to the cart
#    Then proceed to checkout