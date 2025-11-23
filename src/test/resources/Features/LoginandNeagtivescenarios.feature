Feature: Login functionality

  Background:
    Given user is login page


#Verify that User Can Log In Successfully(Positive Test Scenarios)
  @ValidLogin @1  @Regression
  Scenario Outline: Login with Valid credentials
    When user logs in username "<username>" and password "<password>"
    Then user should be redirected to products page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

#Negative Test Scenarios
  @InvalidLogin @1 @2  @Regression @Testing
  Scenario Outline: Login with invalid credentials

    When user logs in username "<username>" and password "<password>"
    Then  user should an error message "<errorMessage>"
    #Then  user should an error message "<errorMessage1>"

    Examples:
      | username        | password     | errorMessage
      | invalid_user    | wrong_pass   | Epic sadface: Username and password do not match any user in this service
      |                 | secret_sauce | Epic sadface: Username is required
      | standard_user   |              | Epic sadface: Password is required
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.

#Invalid Login Credentials
#Test Steps: Enter incorrect username or password.
#Expected Result: Epic sadface: Username and password do not match any user.
#Locked-Out User
#Test Steps: Enter locked_out_user and valid password.
#Expected Result: Epic sadface: Sorry, this user has been locked out.

  @CheckoutwithMissingInformation
  Scenario Outline: Login, add product , go to cart and checkout information and conformation
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    And user checkout page information
    And user data entry information "<firstName>","<lastName>" and "<number>"
    And user click continue
    Then user see a first name error message "Error: First Name is required"
    Examples:
      | firstName | lastName | number |
      |           |          |        |

    #Checkout with Missing Information
    #Test Steps: Leave a checkout field blank and click Continue.
    #Expected Result: Error: First Name is required.




  @RemoveItemfromCart

  Scenario: Login, add product , go to cart , to reach checkout page
    Given user is login page
    When user logs in username "standard_user" and password "secret_sauce"
    And user adds product to cart
    And user goes to cart
    And user click checkout
    Then user should be redirected to cart page


 #Remove Item from Cart
    #Test Steps: Add a product → Open cart → Click Remove.
    #Expected Result: Product is removed from the cart, and total updates correctly





