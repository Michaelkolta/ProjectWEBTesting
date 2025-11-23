package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver Driver= Browser.driver;


    private WebElement FirstName=Driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
    private WebElement LastName=Driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
    private WebElement Zipcode=Driver.findElement(By.xpath("//input[@placeholder=\"Zip/Postal Code\"]"));
    private WebElement Continue=Driver.findElement(By.xpath("//input[@id=\"continue\"]"));



    public void FirstName(String firstName){
        FirstName.sendKeys(firstName);
    }
    public void LastName(String lastName){LastName.sendKeys(lastName);}
    public void Zipcode(String number){Zipcode.sendKeys(number);}
    public void Continue(){
        Continue.click();
    }





}
