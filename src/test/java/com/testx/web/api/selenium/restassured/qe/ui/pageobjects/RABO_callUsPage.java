package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_callUsPage {


    @FindBy(xpath="//a[text()='Call us']")
    public static WebElement btnCallUs;
}
