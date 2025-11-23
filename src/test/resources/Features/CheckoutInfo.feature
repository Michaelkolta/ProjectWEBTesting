Feature: Checkout Information and confirmation


  @checkoutinfo
 Scenario Outline: Login, add product , go to cart and checkout information and conformation
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    And user checkout page information
    And user data entry information "<firstName>","<lastName>" and "<number>"
    Then user click continue
    Examples:
      | firstName | lastName | number |
      | michael   | Boctor   | 00000  |
