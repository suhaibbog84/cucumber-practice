package com.cydeo.page;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * No parameters.
     * When we call this method it will directly login using username Test
     * password Tester
     */
    public void login(){
        this.inputUsername.sendKeys("test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
        //this keyword here is not neccessary, but we put it for the example only
    }

    /**
     * This method will accept two argument and login
     * @param username
     * @param password
     */
    public void login(String username, String password){

        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will login using credintials from Config Properties
     */
    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }

}
