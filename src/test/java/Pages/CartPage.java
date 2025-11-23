package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver Driver = Browser.driver;

    private WebElement pressCheckoutpage = Driver.findElement(By.xpath("//button[@data-test=\"checkout\"]"));
    private WebElement clickremoveitem = Driver.findElement(By.xpath("//button[@data-test=\"remove-sauce-labs-backpack\"]"));

    public void checkoutpress() {
        pressCheckoutpage.click();
    }

    public void clickremove(){
        clickremoveitem.click();
    }

}