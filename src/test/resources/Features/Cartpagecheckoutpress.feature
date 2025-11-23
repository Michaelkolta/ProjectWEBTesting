Feature: checkout


  @checkout

  Scenario: Login, add product , go to cart , to reach checkout page
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    Then user should be redirected to cart page