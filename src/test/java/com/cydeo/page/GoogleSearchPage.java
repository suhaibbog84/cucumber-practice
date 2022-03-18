package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.awt.print.Pageable;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        //creating the constructor
        //initialize the driver inc=stance and this class' instance using PageFactory.initElements
    }

    //we can start locating web elements using @FindBy annotation
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

}
//TC#1: Google Search Functionality Title Verification
//1. User is on Google search page
//2. User types apple in the google search box and clicks enter
//3. User sees apple is in the google title
//Note: Follow POM