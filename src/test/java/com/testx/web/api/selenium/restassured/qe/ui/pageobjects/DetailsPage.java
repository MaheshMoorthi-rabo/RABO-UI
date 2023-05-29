package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage {

    @FindBy(xpath = "//h2[text()='Cover details']")
    public static WebElement coverDetailsText;


    @FindBy(xpath = "//div[text()='Today']/..//input")
    public static WebElement dateToay;


    @FindBy(xpath = "//div[text()='Tomorrow']/..//input")
    public static WebElement dateTomorrow;

    @FindBy(xpath = "//div[text()='Choose a date']/..//input")
    public static WebElement chooseDate;

    @FindBy(xpath = "//input[@name='numberPlate']")
    public static WebElement numberPlate;

    @FindBy(xpath = "//button[text()='Find your vehicle']")
    public static WebElement findYourVehicle;

    @FindBy(xpath = "//h2[text()='We can’t find your vehicle']")
    public static WebElement findVehcilePopup;

    @FindBy(xpath = "//select[@formcontrolname='RegistrationMonth']")
    public static WebElement selectRegistrationMonth;

    @FindBy(xpath = "//input[@name='regYear']")
    public static WebElement registrationYear;

    @FindBy(xpath = "//select[@name='make']")
    public static WebElement selectMake;

    @FindBy(xpath = "//select[@name='model']")
    public static WebElement selectModel;

    @FindBy(xpath = "//button[text()='Confirm']")
    public static WebElement confirmButton;

    @FindBy(xpath = "//span[text()='Mr']/..//input")
    public static WebElement selectTitle;

    @FindBy(xpath = "//input[@id='firstName0']")
    public static WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName0']")
    public static WebElement lastName;

    @FindBy(xpath = "//input[@autocomplete='bday-day']")
    public static WebElement birthDay;

    @FindBy(xpath = "//input[@autocomplete='bday-month']")
    public static WebElement birthMonth;

    @FindBy(xpath = "//input[@autocomplete='bday-year']")
    public static WebElement birthYear;

    @FindBy(xpath = "//input[@id='postCode']")
    public static WebElement postCode;

    @FindBy(xpath = "//button[text()='Find your address']")
    public static WebElement findYourAddress;

    @FindBy(xpath = "//input[@id='contactDetailsPhoneNumber']")
    public static WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='contactDetailsEmailAddress']")
    public static WebElement Email;

    @FindBy(xpath = "//span[text()='Yearly']/../..//input")
    public static WebElement paymentYearly;

    @FindBy(xpath = "//div[text()='Credit/Debit card']/../input")
    public static WebElement creditDebitCardRadioBtn;

    @FindBy(xpath = "//div[text()='Direct Debit']/../input")
    public static WebElement directDebitRadioBtn;


    @FindBy(xpath = "//span[text()='Monthly']/../..//input")
    public static WebElement paymentMonthly;


    @FindBy(xpath = "//span[@class='price']")
    public static WebElement priceOnDetailsPage;

    @FindBy(xpath = "//button[text()='Continue']")
    public static WebElement continueButton;


}

