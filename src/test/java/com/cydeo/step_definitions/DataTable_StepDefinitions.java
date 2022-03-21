package com.cydeo.step_definitions;

import com.cydeo.page.DropdownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String>fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        System.out.println("expectedMonths = " + expectedMonths);

        Select select = new Select(dropdownsPage.monthDropdown);

    }


}
