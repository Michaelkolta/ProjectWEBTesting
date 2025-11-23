package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
            features = "src/test/resources/Features",
            glue = {"StepDef"},
            plugin = {
                    "pretty",
                    "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
            monochrome = true, // logs commands color white and red not more if False
            tags = "@InvalidLogin2"   // and , or , and not
    )
    public class TestNGRunner extends AbstractTestNGCucumberTests {
    }



