package StepDef;

import Pages.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before

    public void setUP() {
        Browser.openBrowser("https://www.saucedemo.com/");
    }



    @After
    public void tearDown() {
        Browser.closeBrowser();

    }

}


