package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverPage extends AbstractPageObject {

    @FindBy(xpath = "//h1[text()='Choose your cover']")
    public static WebElement coverHeaderText;

    @FindBy(xpath = "//div[text()='Cover for you']/..//input")
    public static WebElement coverForYou;

    @FindBy(xpath = "//div[@class='d-flex align-content-end flex-wrap mb-4']/span[@class='price']")
    public static WebElement coverForYouPrice;

    @FindBy(xpath = "//button[text()='Continue']")
    public static WebElement continueButton;

    @FindBy(xpath = "//button[text()='Accept cookies']")
    public static WebElement acceptCokies;

    @FindBy(xpath = "//div[text()='Vehicle cover']/..//input")
    public static WebElement vehicleCover;

    @FindBy(xpath = "//div[text()='Family cover']/..//input")
    public static WebElement familyCcover;

    @FindBy(xpath = "//div[text()='Cover for two people']/..//input")
    public static WebElement coverForTwoPeople;


}