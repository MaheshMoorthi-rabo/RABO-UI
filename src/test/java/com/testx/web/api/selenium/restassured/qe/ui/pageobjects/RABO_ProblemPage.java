package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RABO_ProblemPage {
    @FindBy(xpath = "//button[text()='Yes']")
    public static WebElement btn;

    @FindBy(xpath = "//button[text()='Flat battery']")
    public static WebElement btnFlatBattery;

    @FindBy(xpath = "//button[text()='Flat tyre']")
    public static WebElement btnFlatTyre;

    @FindBy(xpath="//button[contains(text(),'start or cut out')]")
    public static WebElement btnWontStartorCutOut;

    @FindBy(xpath="//button[contains(text(),'Clutch has gone')]")
    public static WebElement btnClutchHasGone;

    @FindBy(xpath="//button[contains(text(),'vehicle lights')]")
    public static WebElement btnDashboardandVehicleLights;

   @FindBy(xpath="//button[contains(text(),'Fuel')] ")
   public static WebElement btnFuel;

    @FindBy(xpath="//button[contains(text(),'alarm')]")
    public static WebElement btnKeyLocks;

    @FindBy(xpath="//button")
    public static WebElement btnBrakesandHandBrakes;


    @FindBy(xpath="//button[contains(text(),'Steering')]")
    public static WebElement btnSteering;

    @FindBy(xpath="//button[contains(text(),'Overheated')]")
    public static WebElement btnOverHeated;


    @FindBy(xpath="//button[contains(text(),'Something else')]")
    public static WebElement btnSomeThingElse;

   @FindBy(xpath="//button[contains(text(),'accident')]")
   public static WebElement btnAccident;


    public static WebElement btnHaveOneSpare;

    public static WebElement btnHaveRepairkit;

    public static WebElement btnHave2moreTyresflat;

    public static WebElement btnHaveNospare;

    public static WebElement btnWontstartAtAll;


    public static WebElement btnItCutOutWontStart;

    public static WebElement btnItLostPower;

    public static WebElement btnOutsideLights;

    public static WebElement btnDashboardLights;

    public static WebElement btnRanoutOfPetrol;

    public static WebElement btnRanOutOfDiesel;

    public static WebElement btnWrongFuelIn;

    public static WebElement btnKeyLockedInside;

    public static WebElement btnKeyLost;

    public static WebElement btndoorLockisnotWorking;


    public static WebElement btnAlarm;
















}
