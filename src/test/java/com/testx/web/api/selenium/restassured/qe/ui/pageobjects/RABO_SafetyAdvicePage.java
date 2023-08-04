package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_SafetyAdvicePage {

    @FindBy(xpath = "//button[text()='Report breakdown']")
    public static WebElement btnReportBreakdown;


    @FindBy(xpath = "//button[text()='Accept cookies']")
    public static WebElement btnacceptCookies;



    @FindBy(xpath = "//button[text()='Log in and report a breakdown']")
    public static WebElement btnloginandreportabreakdown;

}
