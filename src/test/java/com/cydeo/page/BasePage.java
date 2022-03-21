package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    /*
    In this class we will store WebElement common to all pages
     */

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//butto[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//butto[.='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//butto[.='Order']")
    public WebElement order;

    @FindBy(xpath = "//butto[.='Logout']")
    public WebElement logoutButton;


}
