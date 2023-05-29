package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_Map_LocationPage {
    @FindBy(xpath = "//button[text()='Yes']")
    public static WebElement btnYes;
}
