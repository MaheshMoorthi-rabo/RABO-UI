package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_LocationPage {

    @FindBy(xpath = "//button[text()='Enter postcode']")
    public static WebElement btnPostCode;

    @FindBy(xpath = "//button[text()='Share current location']")
    public static WebElement btnshareCurrentLocation;


}
