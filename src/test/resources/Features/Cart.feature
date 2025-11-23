Feature: Saucedemo Login and Cart

  @cart
  Scenario: Login, add product , go to cart
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    Then user should be redirected to products page
    And user adds product to cart
    Then user goes to cart


