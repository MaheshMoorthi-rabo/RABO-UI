package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_VehicleDetailsPage {
    @FindBy(xpath = "//input[@id='otherRegNo']")
    public static WebElement txtVRN;


    @FindBy(xpath = "//button[text()='Confirm number plate']")
    public static WebElement btnConfirmNumberPlate;
    @FindBy(xpath="//a[contains(text(),'know the number plate?')]")
    public static WebElement dontKnowTheNumberPlate;
}
