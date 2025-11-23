package StepDef;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class LocalStepDef {

    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    FinishPage finishPage;
    LogoutPage logout;
    SoftAssert softAssert = new SoftAssert();

    @Given("user is login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage();

    }

    @When("user logs in username {string} and password {string}")
    public void user_logs_in(String user, String pass) {
        loginPage.UserName(user);
        loginPage.Password(pass);
        loginPage.LoginButton();

    }


    @Then("user should be redirected to products page")
    public void user_should_be_redirected_to_products_page() {
        String Actual = Browser.driver.getCurrentUrl();
        String Expected = "https://www.saucedemo.com/inventory.html";
        softAssert.assertEquals(Actual, Expected, "Step Failed : User didn't login ");

    }


    @Then("user should an error message {string}")
    public void user_should_an_error_message(String expectedMessage) {
        String Actualmessage = Browser.driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
        //Assert.assertEquals(Actualmessage, expectedMessage); //(Hard Assert)

    }

    @And("user adds product to cart")
    public void user_adds_product_to_cart() {
        productsPage = new ProductsPage();
        productsPage.product1();
        productsPage.product2();
        System.out.println("step passed: Product add to cart ");

    }

    @And("user goes to cart")
    public void user_goes_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        productsPage.CartPagepress();
        String ActualUrl = Browser.driver.getCurrentUrl();
        String ExpectedUrl = "https://www.saucedemo.com/cart.html";
        softAssert.assertEquals(ActualUrl, ExpectedUrl, "step Failed : User did not reach to cart  ");
        System.out.println("cart page");
    }

    @And("user click checkout")
    public void user_click_checkout() throws InterruptedException {
        Thread.sleep(3000);
        cartPage = new CartPage();
        cartPage.checkoutpress();

    }

    @And("user click remove item")
    public void user_click_remove_item() throws InterruptedException {
        Thread.sleep(5000);
        cartPage.clickremove();
    }




    @Then("user should be redirected to cart page")
    public void user_should_be_redirected_to_cart_page() throws InterruptedException {
        Thread.sleep(2000);

        String ActualUrl = Browser.driver.getCurrentUrl();
        String ExpectedUrl = "https://www.saucedemo.com/checkout-step-one.html";
        softAssert.assertEquals(ActualUrl, ExpectedUrl, "step Failed : User did not reach to checkout  ");
        System.out.println("Checkout page");
    }


    @And("user checkout page information")
    public void user_checkout_page_information() throws InterruptedException {
        checkoutPage = new CheckoutPage();
    }


    @And("user data entry information {string},{string} and {string}")
    public void user_data_entry_information(String firstName, String lastName, String number) throws InterruptedException {
        Thread.sleep(2000);
        checkoutPage.FirstName(firstName);
        checkoutPage.LastName(lastName);
        checkoutPage.Zipcode(number);

    }

    @And("user click continue")
    public void user_click_continue() throws InterruptedException {
        Thread.sleep(2000);
        checkoutPage.Continue();

        String ActualUrl = Browser.driver.getCurrentUrl();
        String ExpectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
        softAssert.assertEquals(ActualUrl, ExpectedUrl, "Step Failed: User did not reach checkout overview page ");
        System.out.println("Step Passed: Checkout overview page displayed");

    }

    @Then("user on checkout overview page click finish")
    public void user_on_checkout_overview_page_click_finish() throws InterruptedException {
        Thread.sleep(2000);
        finishPage = new FinishPage();
        finishPage.FinishPress();

        String ActualUrl = Browser.driver.getCurrentUrl();
        String ExpectedUrl = "https://www.saucedemo.com/checkout-complete.html";
        softAssert.assertEquals(ActualUrl, ExpectedUrl, "Step Failed: User did not reach Checkout complete page ");
        System.out.println("Step Passed: Checkout complete display");

    }

    @Then("user logs out successfully")
    public void logout_the_user() throws InterruptedException {
        Thread.sleep(3000);
        logout = new LogoutPage();
        logout.Menusidebar();
        Thread.sleep(3000);
        logout.LogoutButton();

        String actualUrl = Browser.driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/";
        softAssert.assertEquals(actualUrl, expectedUrl, "Step Failed: User didn't logout");
        System.out.println("Step Passed: User logged out successfully");


    }

    @Then("user see a first name error message {string}")
    public void user_see_a_first_name_error_message(String expectedMessage){

        String actualMessage = Browser.driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

        // Compare actual vs expected using SoftAssert
        softAssert.assertEquals(actualMessage, expectedMessage, "Actual and expected error messages do not match.");

        // Print both for clarity in the console
        System.out.println("Expected: " + expectedMessage);
        System.out.println("Actual: " + actualMessage);
        softAssert.assertAll();

    }

}


























