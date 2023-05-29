package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfirmationPage extends AbstractPageObject {

    @FindBy(xpath = "//p[text()='Membership number']")
    public static WebElement confirmationPageText;

    @FindBy(xpath = "//span[@class='confirmation-price']")
    public static List<WebElement> priceOnConfimationPage;


    @FindBy(xpath = "//div[@class='membership-number']")
    public static List<WebElement> membershipNumber;

    @FindBy(xpath = "//div[@class='mb-3']/div")
    public static WebElement coverIncludes;


}