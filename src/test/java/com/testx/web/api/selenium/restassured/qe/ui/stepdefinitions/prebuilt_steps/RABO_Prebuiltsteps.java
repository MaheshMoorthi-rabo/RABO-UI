package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.prebuilt_steps;

import com.testx.web.api.selenium.restassured.qe.ui.config.Configuration;
import com.testx.web.api.selenium.restassured.qe.ui.config.ConfigurationManager;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class RABO_Prebuiltsteps extends BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(RABO_Prebuiltsteps.class);
    public static Configuration configuration = ConfigurationManager.getConfiguration();
    TestContext testContext;

    public RABO_Prebuiltsteps(TestContext context) {
        super(context);
        this.testContext = context;

    }


    @Then("I verify that the text {string} matches the text of the {string} field on the {string}")
    public void i_verify_that_the_text_matches_the_text_of_the_field_on_the(String text, String elementName, String pageClassName) {
        {
            // Write code here that turns the phrase above into concrete actions
            WebElement element = loadWebElement(elementName, pageClassName);
            try {

                // assertTrue(element.getText().contains(text));
                //
                System.out.println(element.getText());
                System.out.println(text);
                assertEquals(element.getText(), text);
            } catch (Exception e) {
                e.printStackTrace();

            }

        }

    }

    @Then("I verify that the Url has the {string}")
    public void iVerifyThatTheUrlHasThe(String text) {
        try {
            System.out.println(driver.getCurrentUrl());
            Assert.assertTrue(driver.getCurrentUrl().contains(text));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @And("I verify that the {string} displayed on the {string}")
    public void iVerifyThatTheDisplayedOnThe(String elementName, String pageClassName) {
        WebElement element = loadWebElement(elementName, pageClassName);
        try {

            Assert.assertTrue(element.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I verify the driver is redirected to the URL {string}")
    public void iVerifyTheDriverIsRedirectedToTheURL(String url) {
        try {
            boolean op = driver.getCurrentUrl().equals(url);
            Assert.assertTrue(op);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    @Then("I close the Opened TAsk for the {string} in AAhelpdesk")
    public void iCloseTheOpenedTAskForTheInAAhelpdesk(String arg0) {
        driver.get("https://rh0113p:5600/#!/res");
    }

    @And("user is Navigating back to previous page")
    public void userIsNavigatingBackToPreviousPage() {

        driver.navigate().back();
    }
}
