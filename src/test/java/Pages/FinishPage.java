package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {

    private WebDriver Driver= Browser.driver;


    private WebElement Finish=Driver.findElement(By.xpath("//*[@id=\"finish\"]"));

    public void FinishPress(){
        Finish.click();
    }





}
