package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_SafetyQuestionPage {

   @FindBy(xpath="//button[text()='Yes']")
   public static WebElement btnYes;


    @FindBy(xpath="//button[text()='No']")
    public static WebElement btnNo;


}
