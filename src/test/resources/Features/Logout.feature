Feature: Logout Functionality


  @Logout
  Scenario Outline: Verify Logout The User
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    And user checkout page information
    And user data entry information "<firstName>","<lastName>" and "<number>"
    And user click continue
    And user on checkout overview page click finish
    Then user logs out successfully
    Examples:
      | firstName | lastName | number |
      | michael   | Boctor   | 00000  |



