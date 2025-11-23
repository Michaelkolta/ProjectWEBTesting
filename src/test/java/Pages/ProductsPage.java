package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    private WebDriver Driver= Browser.driver;


    private WebElement product1 = Driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    private WebElement product2 = Driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
    private WebElement pressCartPage= Driver.findElement(By.xpath("//a[@data-test=\"shopping-cart-link\"]"));

    public void product1 () {product1.click();}
    public void product2 () {product2.click();}
    public void CartPagepress(){ pressCartPage.click();


    }


}







