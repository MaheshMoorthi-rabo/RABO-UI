package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_CoverPage {

    @FindBy(xpath = "//aa-lib-radio-button[@value='notMember']")
    public static WebElement radioNotaMember;

    @FindBy (xpath="//input[@id='aa-lib-radio-button-3']/parent::aa-lib-radio-button")
    public static WebElement radioMr;

    @FindBy(xpath="//a[@title='Broken Down?']")
    public static WebElement AALogo;

@FindBy(xpath="//input[@id='firstName']")
public static WebElement txtFirstName;

    @FindBy(xpath="//input[@id='lastName']")
    public static WebElement txtLastName;

    @FindBy(xpath="//input[@id='phoneNumber']")
    public static WebElement txtPhoneNum;

    @FindBy(xpath="//button[text()='Submit details ']")
    public static WebElement btnSubmit;

}
