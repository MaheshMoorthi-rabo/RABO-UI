package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageObject {

    @FindBy(id = "user-name")
    public static WebElement usernameInput;

    @FindBy(id = "password")
    public static WebElement passwordInput;

    @FindBy(id = "login-button")
    public static WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    public static WebElement loginButtonError;

}
