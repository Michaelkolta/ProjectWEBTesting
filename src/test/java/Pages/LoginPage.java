package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {




    private WebDriver Driver= Browser.driver;

    private WebElement UserName = Driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    private WebElement Password = Driver.findElement(By.xpath("//*[@id=\"password\"]"));
    private WebElement LoginButton = Driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

    public void UserName(String user){UserName.sendKeys(user);}
    public void Password(String pass){Password.sendKeys(pass);}
    public void LoginButton(){
    LoginButton.click();
}



}
