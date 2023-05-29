package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionPage extends AbstractPageObject {
    @FindBy(xpath = "//div[text()='Roadside Assistance']")
    public static WebElement roadsideAssistance;

    @FindBy(xpath = "//div[text()='At Home']/..//input")
    public static WebElement atHome;

    @FindBy(xpath = "//div[text()='National Recovery']/..//input")
    public static WebElement nationalRecovery;

    @FindBy(xpath = "//div[text()='Onward Travel']/..//input")
    public static WebElement onwardTravel;

    @FindBy(xpath = "//div[text()='Parts and Garage Cover']/..//input")
    public static WebElement partsGarageCover;

    @FindBy(xpath = "//input[@formcontrolname='VehicleRegistrationNumber']")
    public static WebElement vehicleRegistrationNumber;

    @FindBy(xpath = "//button[text()='Add Parts and Garage']")
    public static WebElement partsAndGarageBtn;


}
