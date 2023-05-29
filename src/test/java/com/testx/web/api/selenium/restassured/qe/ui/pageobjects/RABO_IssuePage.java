package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_IssuePage {

    @FindBy(xpath = "//li[@class='active ng-star-inserted']")
    public static WebElement problemProgress;

    @FindBy(xpath = "//h1[contains(text(),'problem?')]")
    public static WebElement txtProblemQuery;

}
