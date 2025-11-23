package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    private WebDriver Driver= Browser.driver;

    private WebElement menusidebar = Driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
    private WebElement logoutButton = Driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));

    public void Menusidebar(){
        menusidebar.click();
    }


    public void LogoutButton(){
        logoutButton.click();
    }


}
