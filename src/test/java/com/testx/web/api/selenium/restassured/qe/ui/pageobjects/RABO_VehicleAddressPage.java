package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_VehicleAddressPage {

    @FindBy(xpath = "//label[text()='Postcode']/following-sibling::input")
    public static WebElement txtpostCode;

    @FindBy(xpath = "//label[contains(text(),'First line of address')]/following-sibling::input")
    public static WebElement txtaddressline;

    @FindBy(xpath = "//button[text()='Find address']")
    public static WebElement btnFindAddress;


}
