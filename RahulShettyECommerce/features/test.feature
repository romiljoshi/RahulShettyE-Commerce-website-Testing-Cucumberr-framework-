Feature: Login with Valid Credentials

  @sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "romiljoshi766@gmail.com" and password as "Test@123"
    And the user clicks on the Login button
    Then the user should be redirected to the home page and verify ZARA Coat text
    And Add one item in a cart 
    When user navigate to Cart page 
    Then verify price of product, subtotal and Total
    And user click on Continue Shopping
    When user again redirect to home page and add one more iteam
    Then user navigate to cart and verify 
    And user click on cheakout
    When user navigate to chekout page 
    Then user should verify "romiljoshi766@gmail.com" and enter country
    When user place the order
    Then user verify the order confirmation
    When user navigate to order page 
    Then user varify the order name and delete the order
    And user click on signout 
    
    
    