package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPage {

    public DropdownsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
