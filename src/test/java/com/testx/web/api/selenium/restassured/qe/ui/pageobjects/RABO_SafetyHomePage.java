package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_SafetyHomePage {


    @FindBy(xpath = "//button[text()='Continue online']")
    public static WebElement btnContinue;


    @FindBy(xpath = "//button[text()='Accept cookies']")
    public static WebElement btnacceptCookies;

    @FindBy(xpath = "")
    public static WebElement dateToay;

}
