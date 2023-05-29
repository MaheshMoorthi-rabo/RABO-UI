package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {


    @FindBy(xpath = "//iframe[@title='Payment page']")
    public static WebElement iframePaymentPage;
    //Direct Debit
    @FindBy(xpath = "//h2[text()='Monthly Direct Debit details']")
    public static WebElement directDebitText;

    @FindBy(xpath = "//input[@id='accountName']")
    public static WebElement accountName;

    @FindBy(xpath = "//input[@id='accountNumber']")
    public static WebElement accountNumber;

    @FindBy(xpath = "//input[@id='sortCode']")
    public static WebElement sortCode;

    @FindBy(xpath = "//span[@class='basket-price']")
    public static WebElement priceOnPaymentPage;

    @FindBy(xpath = "//button[text()='Buy now']")
    public static WebElement buyNowButton;

    //CreditCard/DebitCard

    @FindBy(xpath = "//iframe[@title='Payment Frame']")
    public static WebElement iframeCreditCard;

    @FindBy(xpath = "//h2[text()='Your payment']")
    public static WebElement CardPayment;

    @FindBy(xpath = "//input[@id='pas_ccnum']")
    public static WebElement cardNumber;

    @FindBy(xpath = "//input[@id='pas_expiry']")
    public static WebElement cardExpiry;

    @FindBy(xpath = "//input[@id='pas_cccvc']")
    public static WebElement cardCVV;

    @FindBy(xpath = "//input[@id='pas_ccname']")
    public static WebElement nameOnCard;

    @FindBy(xpath = "//button[@value='Pay Now']")
    public static WebElement payNowButton;

}
