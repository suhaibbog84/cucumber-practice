package com.cydeo.selenium_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "idvalue")
    public WebElement usernameBox;

    @FindBy(name = "Whatever")
    public WebElement passwordBox;

    @FindBy(css = "input[type='submit'][value='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsgElement;

    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get();
    }

}
