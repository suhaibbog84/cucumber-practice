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

    @FindBy()
    public WebElement viewAllOrders;


}
