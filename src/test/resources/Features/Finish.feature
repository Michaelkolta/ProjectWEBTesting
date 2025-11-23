Feature: Finish


  @Finish
  Scenario Outline: Checkout:Complete
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    And user checkout page information
    And user data entry information "<firstName>","<lastName>" and "<number>"
    And user click continue
    Then user on checkout overview page click finish
    Examples:
      | firstName | lastName | number |
      | michael   | Boctor   | 00000  |
      | joy       | Boctor   | 00000  |


