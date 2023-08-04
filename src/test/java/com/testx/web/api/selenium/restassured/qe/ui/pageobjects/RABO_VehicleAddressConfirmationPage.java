package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class

RABO_VehicleAddressConfirmationPage {

    @FindBy(xpath = "//select[@id='countryFieldCtrl']")
    public static WebElement ddSelectAnAddress;

    @FindBy(xpath = "//button[text()='Use this address']")

    public static WebElement btnUseThisAddress;


    @FindBy(xpath="//a[text()='Address isn’t listed']")
    public static WebElement btnAddressisNotListed;
}
